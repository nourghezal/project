package com.projet.com.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/demo-controller")
@RestController
public class DemoController {
@GetMapping
    public ResponseEntity<String> sayHello(){
    return ResponseEntity.ok("Hello from secured endpoint ");
    }
}
