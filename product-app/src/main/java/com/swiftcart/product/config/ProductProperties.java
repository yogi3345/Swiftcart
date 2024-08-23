package com.swiftcart.product.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductProperties {
  @Value("${product.property.name}")
  private String name;
}
