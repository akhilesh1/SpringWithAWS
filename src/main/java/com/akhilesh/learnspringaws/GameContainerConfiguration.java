package com.akhilesh.learnspringaws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameContainerConfiguration {
    @Bean
    public ContraGame contraGame(){return new ContraGame();}
    @Bean
    public MarioGame marioGame(){return new MarioGame();}

    @Bean
    @Primary
    public GameRunner gameRunner(MarioGame marioGame){
        return new GameRunner(marioGame);
    }
    @Bean
    public GameRunner contraGameRunner(){
        return new GameRunner(contraGame());
    }
}
