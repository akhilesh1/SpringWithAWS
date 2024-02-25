package com.akhilesh.learnspringaws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(GameContainerConfiguration.class);
//        GameCartiage cartiage=applicationContext.getBean(MarioGame.class);
//        var gameRunner=new GameRunner(cartiage);
//        gameRunner.run();
//        cartiage=applicationContext.getBean(ContraGame.class);
//        gameRunner =new GameRunner(cartiage);
//        gameRunner.run();

        var gameRunnerFromSpring=applicationContext.getBean(GameRunner.class);
        gameRunnerFromSpring.run();

        var runner=(GameRunner)applicationContext.getBean("contraGameRunner");
        runner.run();

    }
}
