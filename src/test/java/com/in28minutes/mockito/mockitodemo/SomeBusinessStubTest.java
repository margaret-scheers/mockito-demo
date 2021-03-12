package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {
    @Test
    void findGreatestOfAllDataTest() {
        DataServiceStub stub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(stub);
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(24, result);

    }
}

class DataServiceStub implements DataService {


    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}