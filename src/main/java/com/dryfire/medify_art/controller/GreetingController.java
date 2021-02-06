package com.dryfire.medify_art.controller;

import com.dryfire.medify_art.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World") String name){
    return new Greetings(counter.incrementAndGet(),String.format(template,name));
    }
}
