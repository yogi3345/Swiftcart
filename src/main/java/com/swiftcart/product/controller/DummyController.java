package com.swiftcart.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DummyController {

  @GetMapping("/hello")
  public String testEndPoint() {
    return "Hello Swift cart";
  }

  @GetMapping("/health")
  public ResponseEntity<String> healthCheck() {

    return ResponseEntity.ok("Service is up and running!");
  }
}
