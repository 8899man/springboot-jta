package cn.forever.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.forever.demo.datasource.Test2DBConfig;
import cn.forever.demo.datasource.TestDBConfig;


@SpringBootApplication
@EnableConfigurationProperties(value = { TestDBConfig.class,Test2DBConfig.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
