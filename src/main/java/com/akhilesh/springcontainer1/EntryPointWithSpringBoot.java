package com.akhilesh.springcontainer1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class EntryPointWithSpringBoot {
    public static void main(String[] args) {
        //Setup context
        AnnotationConfigApplicationContext appContext=
                new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        System.out.println(appContext.getBean("yourName"));
        System.out.println(appContext.getBean(Employee.class));
        System.out.println(appContext.getBean("employeeUsingParameters"));
        System.out.println(appContext.getBean("employeeUsingMethodCall"));
        Arrays.stream(appContext.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
