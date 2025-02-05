package com.practice.franchisecafe.syncnonblocking;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Sample {

    @Test
    void test() {
        // Thread 객체 생성
        Thread thread = new Thread(new MyTask());

        // 스레드 실행
        thread.start();

        // Non-Blocking이므로 다른 작업 계속 가능
        log.info("[{}] Main thread is running...", Thread.currentThread().getName());

        // Sync를 위해 스레드의 작업 완료 여부 확인
        while (thread.isAlive()) {
            log.info("[{}] Waiting for the thread to finish...", Thread.currentThread().getName());
        }
        log.info("[{}] Thread finished!", Thread.currentThread().getName());
        log.info("[{}] Run the next tasks", Thread.currentThread().getName());
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            log.info("[{}] Thread is running...", Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.error("[{}] Thread interrupted!", Thread.currentThread().getName(), e);
            }
            log.info("[{}] Thread finished!", Thread.currentThread().getName());
        }
    }
}

