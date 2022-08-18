package org.Sylvester;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan (basePackages = "org.Sylvester")
public class AppConfig {
    @Bean
    public Student Info(){
        return new Student();
    }
    @Bean
    public Phone getPhone() {
        return new Phone();
    }
    @Bean
    public Address getAddress() {
        return new Address();
    }
}
