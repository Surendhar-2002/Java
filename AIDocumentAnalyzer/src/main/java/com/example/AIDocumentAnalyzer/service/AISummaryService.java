package com.example.AIDocumentAnalyzer.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AISummaryService {

    private final ChatClient chatClient;

    public AISummaryService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String summarize(String text) {

        return chatClient.prompt()
                .user("Summarize this document in simple points:\n" + text)
                .call()
                .content();
    }
}
