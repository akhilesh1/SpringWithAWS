package com.akhilesh.using.components;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.akhilesh.using.components")
public class Launcher {
    public static void main(String[] args) {

        var applicationContext=new AnnotationConfigApplicationContext(Launcher.class);
        var gameRunnerFromSpring=applicationContext.getBean(GameRunner.class);
        gameRunnerFromSpring.run();

        System.out.println(applicationContext.getBean(PropertyGetSetInjection.class));
    }
}
