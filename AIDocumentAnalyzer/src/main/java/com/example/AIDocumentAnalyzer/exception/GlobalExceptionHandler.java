package com.example.AIDocumentAnalyzer.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {

        return ResponseEntity
                .badRequest()
                .body(e.getMessage());
    }
}
