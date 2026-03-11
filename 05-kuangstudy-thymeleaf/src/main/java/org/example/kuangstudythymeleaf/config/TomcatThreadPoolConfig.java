package org.example.kuangstudythymeleaf.config;

import org.apache.coyote.AbstractProtocol;
import org.apache.coyote.ProtocolHandler;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatThreadPoolConfig {

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatThreadPoolCustomizer() {
        return factory -> factory.addConnectorCustomizers(connector -> {
            ProtocolHandler protocolHandler = connector.getProtocolHandler();
            if (protocolHandler instanceof AbstractProtocol<?> protocol) {
                // [MOD-CONCURRENCY] Max request handling threads: 100.
                protocol.setMaxThreads(100);
                // [MOD-CONCURRENCY] Keep warm threads for burst traffic.
                protocol.setMinSpareThreads(20);
                // [MOD-CONCURRENCY] Connector waiting queue capacity.
                protocol.setAcceptCount(200);
            }
        });
    }
}
