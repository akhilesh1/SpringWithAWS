package com.akhilesh.springcontainer1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Employee (String name,String designation,int salary){}
@Configuration
public class MySpringConfiguration {
    @Bean(name="yourName")
    public String myName()
    {
        return "akhilesh chaurasiya";
    }
    @Bean
    public Employee employeeUsingMethodCall(){
        return new Employee(myName(),"PL",43);
    }
    @Bean
    @Primary
    public Employee employeeUsingParameters(String yourName){
        return new Employee(yourName,"PL",45);
    }
}
