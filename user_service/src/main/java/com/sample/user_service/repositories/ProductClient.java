package com.sample.user_service.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/welcome")
    ResponseEntity<String> getProducts();
}
