package com.projet.com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from API!");
    }

    @PostMapping("/data")
    public ResponseEntity<String> postData(@RequestBody String data) {
        // Traitement des données reçues
        return ResponseEntity.ok("Data received: " + data);
    }
}
