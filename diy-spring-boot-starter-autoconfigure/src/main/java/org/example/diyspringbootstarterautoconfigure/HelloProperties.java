package org.example.diyspringbootstarterautoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "diy.hello")
public class HelloProperties {
    private String prefix = "Hello, ";
    private String suffix  =" !";
}
