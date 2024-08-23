package com.swiftcart.product.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CommonProperties {
  @Value("${common.property.name}")
  private String name;
}
