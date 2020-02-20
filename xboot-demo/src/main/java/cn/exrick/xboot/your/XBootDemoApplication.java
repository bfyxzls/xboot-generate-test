package cn.exrick.xboot.your;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("cn.exrick.xboot.your.mapper")
public class XBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(XBootDemoApplication.class, args);
    }
}
