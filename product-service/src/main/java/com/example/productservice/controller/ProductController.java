package com.example.productservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("These are all the products");
    }

}
