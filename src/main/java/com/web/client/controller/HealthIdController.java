package com.web.client.controller;

import com.web.client.dto.AccessToken;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import static org.apache.tomcat.util.http.fileupload.FileUploadBase.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/health-id")
@RequiredArgsConstructor
public class HealthIdController {


    @GetMapping
    public AccessToken getByHealthId() {
        final WebClient webClient = WebClient.builder()
                .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .build();
        return webClient
                .post()
                .uri("")
                .bodyValue("")
                .headers(httpHeaders -> {
                    httpHeaders.set("","");
                    httpHeaders.set("","");
                })
                .retrieve()
                .bodyToFlux(AccessToken.class).onErrorReturn(new AccessToken("error occurred")).blockFirst();
    }
}
