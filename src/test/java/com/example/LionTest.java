package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int actualKittens = lion.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(0, actualKittens);
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualDoesHaveMane = lion.doesHaveMane();
        assertEquals(true, actualDoesHaveMane);

    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(mocList);
        List<String> actualList = lion.getFood();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}