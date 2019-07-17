package com.donghyoen.resttemplate.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateResources {

    @RequestMapping("/")
    public String restTemplateTest() {
        RestTemplate restTemplate = new RestTemplate();
        //request and get responses
        String str = restTemplate.getForObject("http://localhost:8011/",String.class);

        //execute after 3 seconds later.
        System.out.println("1...");
        System.out.println("2...");
        System.out.println("3...");

        System.out.println(str);
        return str;
    }
}
