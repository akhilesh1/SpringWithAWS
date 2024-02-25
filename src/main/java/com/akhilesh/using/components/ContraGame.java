package com.akhilesh.using.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContraGame implements GameCartiage {
    public void run(){
        System.out.println("Contra running");
    }
}
