package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i)
    {
        int result=1;
        if(i == 0)
            return 1;
        if(i <0)
            throw new IllegalArgumentException();
        for(int x=1; x<= i; x++)
            result = result * x;
        return result;
    }
}
