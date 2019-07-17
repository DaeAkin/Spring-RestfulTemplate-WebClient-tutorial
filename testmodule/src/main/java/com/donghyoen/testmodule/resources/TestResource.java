package com.donghyoen.testmodule.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//tihs module port number is 8011.
@RestController
public class TestResource {

    @RequestMapping("/")
    public String testModule() throws InterruptedException {

        //delay
        Thread.sleep(3000);

        return "this is TestModule";
    }
}
