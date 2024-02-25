package com.akhilesh.using.components.business.calculations;

import org.springframework.stereotype.Component;

@Component
public class MongoDataLayer implements DataService{
    @Override
    public int[] getData() {
        return new int[] {1,2,4,5,9};
    }
}
