package com.practice.franchisecafe.openapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChatGptServiceTest {

    @Autowired ChatGptService chatGptService;

    @Test
    void testChatGpt() throws JsonProcessingException {
        QuestionRequest questionRequest = new QuestionRequest();
        questionRequest.setQuestion("How are you?");

        Flux<String> ask = chatGptService.ask(questionRequest);

        System.out.println(ask.blockFirst());

    }
}