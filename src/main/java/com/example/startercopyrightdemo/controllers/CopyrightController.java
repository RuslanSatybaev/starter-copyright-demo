package com.example.startercopyrightdemo.controllers;

import com.freedom.service.CopyrightGenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyrightController {

    private final CopyrightGenService genService;

    public CopyrightController(CopyrightGenService genService) {
        this.genService = genService;
    }

    @GetMapping
    public String getCopyright() {
        return genService.generateCopyright();
    }
}
