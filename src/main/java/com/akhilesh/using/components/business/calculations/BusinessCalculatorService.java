package com.akhilesh.using.components.business.calculations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculatorService {
    private final DataService dataService;
    BusinessCalculatorService(@Qualifier("mongoDataLayer") DataService dataService){
        this.dataService=dataService;
    }
    public  int findMax()
    {
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }
}
