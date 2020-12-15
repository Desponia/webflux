package com.yuna.webflux.hello;

import com.yuna.webflux.good.Good;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class GreetingWebClient {
    private final WebClient client = WebClient.create("http://localhost:8080");

    private final String result = client.get()
            .uri("/hello")
            .accept(MediaType.TEXT_PLAIN)
            .exchangeToMono(res -> res.bodyToMono(String.class)).block();

    private final Good result2 = client.get()
            .uri("/good")
            .accept(MediaType.APPLICATION_JSON)
            .exchangeToMono(res -> res.bodyToMono(Good.class)).block();

    public String getResult() {
        return result + result2;
    }
}
