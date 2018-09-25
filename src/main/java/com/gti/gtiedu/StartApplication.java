package com.gti.gtiedu;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com.gti.gtiedu.dao")
public class StartApplication {

//	private static final Logger logger = LoggerFactory.getLogger(AbstractHttpJsonDecoder.class);

	public static void main(String[] args) {
		System.out.print("项目启动");
		SpringApplication.run(StartApplication.class, args);
	}
}
