package com.example.demo.Controler;

import com.example.demo.service.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final service service;

    public Controller(service service) {
        this.service = service;
    }

    @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }
}