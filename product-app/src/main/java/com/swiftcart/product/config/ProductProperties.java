package com.swiftcart.product.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class ProductProperties {
  @Value("${product.property.name}")
  private String name;
}
