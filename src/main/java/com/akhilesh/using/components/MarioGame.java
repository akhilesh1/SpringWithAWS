package com.akhilesh.using.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("MarioQualifier")
public class MarioGame implements GameCartiage {
    public void run(){
        System.out.println("Mario running");
    }
}
