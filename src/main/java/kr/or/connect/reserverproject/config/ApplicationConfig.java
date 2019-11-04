package kr.or.connect.reserverproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"kr.or.connect.reserverproject.dao","kr.or.connect.reserverproject.service","kr.or.connect.reserverproject.impl"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
