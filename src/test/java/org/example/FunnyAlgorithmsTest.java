package org.example;

import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmsTest{
    
   private static FunnyAlgorithms funnyAlgorithms = new FunnyAlgorithms();

    @BeforeClass
    public static void prepareAll(){
        System.out.println("Test Before Class");
        DateTime ora = new DateTime();
        System.out.println(ora);
}

    @Before
    public void prepareTest(){
        System.out.println("Before Test");
        DateTime ora = new DateTime();
        System.out.println(ora);
    }

    @Test
    public void numTrovato(){
        int[] a = {3,4,7,12,22,34,67,72,87,90,95};
        int n = 12;
        assertEquals(3,funnyAlgorithms.binarySearch(a,n));
        DateTime ora = new DateTime();
        System.out.println(ora);
    }

    @Test(expected = NumberFormatException.class)
    public void exestrtoInt(){
        String numero = "125t";
        funnyAlgorithms.stringToIntConverter(numero);
        DateTime ora = new DateTime();
        System.out.println(ora);
    }
    @Test
    public void correctConvert(){
        String numero= "23";
        assertEquals(23, funnyAlgorithms.stringToIntConverter(numero));
        DateTime ora = new DateTime();
        System.out.println(ora);
    }

    @Test
    public void correctSelection(){
        int[] a= {2,12,45,3,76,100,22,172};

        assertEquals(Arrays.asList(2,3,22,45,76,100,172), funnyAlgorithms(a));
        DateTime ora = new DateTime();
        System.out.println(ora);
    }



}
