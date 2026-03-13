package com.example.AIDocumentAnalyzer.repository;

import com.example.AIDocumentAnalyzer.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long> {

}
