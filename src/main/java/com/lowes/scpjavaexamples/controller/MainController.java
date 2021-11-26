package com.lowes.scpjavaexamples.controller;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/", produces = MediaType.TEXT_HTML_VALUE)
    public String defaultHTML() {
        return "index";
    }
}
