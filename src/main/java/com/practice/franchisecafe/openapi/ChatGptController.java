package com.practice.franchisecafe.openapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatGptController {

    private final ChatGptService chatGptService;

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> chatStream(@RequestParam(name = "question") String question) throws JsonProcessingException {
        QuestionRequest request = new QuestionRequest();
        request.setQuestion(question);
        return chatGptService.ask(request);
    }
}

