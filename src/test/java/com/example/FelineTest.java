package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void getFamily() {
        String actualFamaly = feline.getFamily();
        assertEquals("Кошачьи", actualFamaly);
    }

    @Test
    public void getKittens() {
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }

}