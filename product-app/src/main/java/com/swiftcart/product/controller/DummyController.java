package com.swiftcart.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DummyController {

  // Create a logger instance
  private static final Logger logger = LoggerFactory.getLogger(DummyController.class);

  @GetMapping("/hello")
  public String testEndPoint() {
    // Log an info message
    logger.info("Received request for /hello endpoint");
    return "Hello Swift cart";
  }

  @GetMapping("/health")
  public ResponseEntity<String> healthCheck() {
    // Log an info message
    logger.info("Received request for /health endpoint");
    return ResponseEntity.ok("Service is up and running!");
  }
}
