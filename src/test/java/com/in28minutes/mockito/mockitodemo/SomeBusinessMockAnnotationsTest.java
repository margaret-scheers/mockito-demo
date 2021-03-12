package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void findGreatestOfAllDataTest() {
        //DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});

        //SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(24, result);

    }

    @Test
    public void findGreatestOfAllDataTest2() {
        //DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15});

        //SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findGreatestFromAllData();
        assertEquals(24, result);

    }
}
