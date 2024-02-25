package com.akhilesh.using.components.business.calculations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataLayer implements DataService{
    @Override
    public int[] getData() {
        return new int[] {10,20,40,50,90};
    }
}
