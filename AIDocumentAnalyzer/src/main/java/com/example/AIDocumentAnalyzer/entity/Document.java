package com.example.AIDocumentAnalyzer.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;

    @Lob
    private String extractedText;

    @Lob
    private String summary;
    private LocalDateTime uploadedAt;

}
