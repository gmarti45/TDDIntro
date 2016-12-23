package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {

    public int compute(int number )
    {
        int result=1;
        if(number == 0)
            return 1;
        if(number <0)
            throw new IllegalArgumentException();
        for(int i=1; i<= number; i++)
            result = result * i;
        return result;
    }
}
