package com.dk.microservice.courseservice.controller;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class CircuitBreakerController {

    @GetMapping("/simple/api")
    @Retry(name = "test-01", fallbackMethod = "fallback")
    public ResponseEntity<String> cbApi() {
        log.info("Sample api call received");
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:1234/test", String.class);
        return forEntity;
    }

    public ResponseEntity<String> fallback(Exception ex) {
        return ResponseEntity.ok("Calling fallback method");
    }
}
