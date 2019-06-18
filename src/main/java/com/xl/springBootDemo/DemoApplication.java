package com.xl.springBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/19 0:02
 * @Modified By：
 * @MapperScan("com.xl.springBootDemo.dao") 扫描dao层代码
 */
@SpringBootApplication
@MapperScan("com.xl.springBootDemo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
