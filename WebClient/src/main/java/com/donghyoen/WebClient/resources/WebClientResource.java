package com.donghyoen.WebClient.resources;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebClientResource {

    @RequestMapping
    public String webClientTest() {
        WebClient.Builder webClientBuilders = WebClient.builder();

        System.out.println("init retrieve");
        Mono<String> mono =  webClientBuilders.build()
                .get()
                .uri("http://localhost:8011/")
                .retrieve()
                .bodyToMono(String.class);


        System.out.println("1...");
        System.out.println("2...");
        System.out.println("3...");

        String str = mono.block();

        System.out.println(str);

        return str;

    }
}
