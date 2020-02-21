package com.lind.springboot.mybtisplugs.generate;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lind.springboot.mybtisplugs.generate.mapper")  //配置mapper扫描
public class Application {

    public static void main(String[] args) throws Exception {
        MpGenerator.main("D:\\MybatisGenerateDir","lawteam");
        SpringApplication.run(Application.class, args);
    }
}
