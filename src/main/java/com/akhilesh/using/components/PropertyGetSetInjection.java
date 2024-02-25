package com.akhilesh.using.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyGetSetInjection {

    public PropertyGetSetInjection(Dependency1 dep1,Dependency2 dep2){
        this.dep1=dep1;
        this.dep2=dep2;
    }
    public Dependency1 getDep1() {
        return dep1;
    }

//    @Autowired
//    public void setDep1(Dependency1 dep1) {
//        this.dep1 = dep1;
//    }


    public Dependency2 getDep2() {
        return dep2;
    }

//    @Autowired
//    public void setDep2(Dependency2 dep2) {
//        this.dep2 = dep2;
//    }

    Dependency1 dep1;

    Dependency2 dep2;

    @Override
    public String toString() {
        return "Using "+dep1+" Using "+dep2;
    }

}
