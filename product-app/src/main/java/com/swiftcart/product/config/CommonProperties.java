package com.swiftcart.product.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class CommonProperties {
  @Value("${common.property.name}")
  private String name;
}
