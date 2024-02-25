package com.akhilesh.using.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

    @Autowired
    Dependency1 dep1;
    @Autowired
    Dependency2 dep2;

    @Override
    public String toString() {
        return "Using "+dep1+" Using "+dep2;
    }
}


@Component
class Dependency1{

}

@Component
class Dependency2{

}