package tech.ics.innovativecodespacebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("tech.ics.innovativecodespacebackend.mapper")
public class InnovativeCodeSpaceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnovativeCodeSpaceBackendApplication.class, args);
    }

}
