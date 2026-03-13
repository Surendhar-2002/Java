package com.example.AIDocumentAnalyzer.service;


import org.apache.tika.Tika;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class DocumentParserService {

    private final Tika tika = new Tika();


    public String extractTextFromDocument(InputStream inputStream) {

        try {
            return tika.parseToString(inputStream);
        } catch (Exception exception) {
            throw new RuntimeException(
                    "Failed to extract text from document", exception);
        }

    }
}
