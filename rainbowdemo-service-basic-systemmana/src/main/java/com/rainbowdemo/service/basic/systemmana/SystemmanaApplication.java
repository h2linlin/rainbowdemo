package com.rainbowdemo.service.basic.systemmana;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @Desc
 * @Author wuzh
 * @Date 2020/5/15
 */
@SpringBootApplication
//@MapperScan(basePackages = "com.rainbowdemo.service.basic.systemmana.mapper")
@EnableAutoConfiguration(excludeName = "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration")
public class SystemmanaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemmanaApplication.class);
    }
}
