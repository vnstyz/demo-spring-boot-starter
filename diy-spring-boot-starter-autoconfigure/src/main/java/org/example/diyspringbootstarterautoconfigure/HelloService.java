package org.example.diyspringbootstarterautoconfigure;

import lombok.Data;

@Data
public class HelloService {
    private final HelloProperties properties;

    public HelloService(HelloProperties properties) {
        this.properties = properties;
    }

    public String sayHello(String name) {
        return properties.getPrefix() + name +  properties.getSuffix();
    }
}
