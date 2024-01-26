package com.sample.user_service.servicce;

import com.sample.user_service.repositories.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductClient productClient;

    public ResponseEntity<String> getProducts() {
        return productClient.getProducts();
    }

}
