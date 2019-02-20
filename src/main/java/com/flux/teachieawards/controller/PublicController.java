package com.flux.teachieawards.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/public")
public class PublicController {
    @GetMapping("/uptest")
    public String uptest() {
        return "Hello. I'm awake and the time at the server is now " + new Date() + "\n";
    }
}
