package com.swiftcart.product.controller;

import com.swiftcart.product.config.CommonProperties;
import com.swiftcart.product.config.ProductProperties;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

  @Autowired private CommonProperties commonProperties;

  @Autowired private ProductProperties productProperties;

  @GetMapping("/fetchprops")
  public ResponseEntity<Map<String, String>> testConfig() {
    Map<String, String> response = new HashMap<>();
    response.put("commonProperty", commonProperties.getName());
    response.put("productProperty", productProperties.getName());
    return ResponseEntity.ok(response);
  }
}
