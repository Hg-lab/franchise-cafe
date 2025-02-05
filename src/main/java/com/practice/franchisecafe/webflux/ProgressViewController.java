package com.practice.franchisecafe.webflux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import java.time.Duration;

@Slf4j
@Controller
@RequestMapping("/progress")
public class ProgressViewController {

    // ✅ 뷰 페이지 반환 (progress.html)
    @GetMapping
    public String showProgressPage() {
        return "progress"; // resources/templates/progress.html (Thymeleaf 사용)
    }

    // ✅ SSE 스트리밍 API (로딩 상태 반환)
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<String> streamProgress() {
        return Flux.interval(Duration.ofSeconds(1)) // 1초마다 실행
                .map(tick -> {
                    int progress = (int) ((tick + 1) * 20); // 진행률 20%씩 증가
                    if (progress >= 100) {
                        return "100% - Task Completed!";
                    }
                    return progress + "% - Processing...";
                })
                .take(5) // 5번 실행 후 완료
                .doOnNext(log::info);
    }
}
