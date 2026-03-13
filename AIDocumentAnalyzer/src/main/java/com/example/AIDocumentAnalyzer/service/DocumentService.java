package com.example.AIDocumentAnalyzer.service;

import com.example.AIDocumentAnalyzer.entity.Document;
import com.example.AIDocumentAnalyzer.repository.DocumentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.slf4j.Logger;

import java.time.LocalDateTime;

@Service
public class DocumentService {

    private final DocumentParserService parserService;
    private final AISummaryService aiService;
    private final DocumentRepository repository;

    private static final Logger log =
            LoggerFactory.getLogger(DocumentService.class);


    public DocumentService(DocumentParserService parserService, AISummaryService aiService, DocumentRepository repository) {
        this.parserService = parserService;
        this.aiService = aiService;
        this.repository = repository;
    }

    public Document processDocument(MultipartFile file) throws Exception {

        log.info("File uploaded: {}", file.getOriginalFilename());

        String text = parserService.extractTextFromDocument(file.getInputStream());

        log.info("Text extracted. Length: {}", text.length());

        String limitedText = text.substring(0, Math.min(text.length(), 2000));

        log.info("Sending text to AI for summarization...");

        String summary = aiService.summarize(limitedText);

        log.info("AI summary received");

        Document document = new Document();

        document.setFileName(file.getOriginalFilename());
        document.setSummary(summary);
        document.setExtractedText(text);
        document.setUploadedAt(LocalDateTime.now());

        log.info("Saving document to database");

        return repository.save(document);
    }
}
