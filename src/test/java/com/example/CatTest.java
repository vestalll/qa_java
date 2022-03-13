package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline feline;


    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void catFood() throws Exception {
        Cat cat = new Cat(feline);
       List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
       Mockito.when(cat.getFood()).thenReturn(mocList);
       List<String> actualList = cat.getFood();
       List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
       assertEquals(expectedList, actualList);

    }
}