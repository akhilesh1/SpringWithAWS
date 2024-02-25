package com.akhilesh.using.components;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.akhilesh.using.components")
public class GameLauncher {
    public static void main(String[] args) {

        var applicationContext=new AnnotationConfigApplicationContext(GameLauncher.class);
        var gameRunnerFromSpring=applicationContext.getBean(GameRunner.class);
        gameRunnerFromSpring.run();
    }
}
