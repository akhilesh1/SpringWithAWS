package com.akhilesh.using.components.business.calculations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.*;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
    }
}
