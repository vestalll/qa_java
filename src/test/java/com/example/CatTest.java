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

public class CatTest {

    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void getSound() {
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

   @Test
   public void catFoodTest() throws Exception {
       Cat cat = new Cat(feline);
       List<String> mocList = Arrays.asList("Мясо", "Птица", "Рыба");
       Mockito.when(cat.getFood()).thenReturn(mocList);
       List<String> actualList = cat.getFood();
       List<String> expectedList = Arrays.asList("Мясо", "Птица", "Рыба");
       assertEquals(expectedList, actualList);

    }
}