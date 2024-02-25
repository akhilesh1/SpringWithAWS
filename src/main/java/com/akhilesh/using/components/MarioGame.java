package com.akhilesh.using.components;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameCartiage {
    public void run(){
        System.out.println("Mario running");
    }
}
