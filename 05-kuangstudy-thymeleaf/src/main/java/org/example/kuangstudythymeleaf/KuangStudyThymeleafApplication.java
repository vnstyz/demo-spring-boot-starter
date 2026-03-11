package org.example.kuangstudythymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.example.kuangstudythymeleaf.mapper")
@SpringBootApplication
public class KuangStudyThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuangStudyThymeleafApplication.class, args);
    }

}
