package com.example.AIDocumentAnalyzer.controller;

import com.example.AIDocumentAnalyzer.entity.Document;
import com.example.AIDocumentAnalyzer.service.DocumentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/upload")
    public Document uploadDocument(@RequestParam("file") MultipartFile file) throws Exception {
        return documentService.processDocument(file);
    }
}