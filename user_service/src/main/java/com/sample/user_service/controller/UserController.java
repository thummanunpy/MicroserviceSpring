package com.sample.user_service.controller;

import com.sample.user_service.repositories.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ProductClient productClient;

    @GetMapping("/welcome")
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.ok("These are all the users");
    }

    @GetMapping("/product/welcome")
    public ResponseEntity<String> getUsers2() {
        return productClient.getProducts();
    }
}
