package com.swiftcart.product;

import com.swiftcart.product.config.CommonProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ProductServiceApplicationTests {

  @Autowired private CommonProperties commonProperties;

  @Test
  void contextLoads() {
    System.out.println(commonProperties.getName());
  }
}
