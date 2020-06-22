package com.maximumgenericproblem.services;

import java.util.Arrays;

public class MaximumProblemGenericServices <E extends Comparable>  {
    E array[];

    public MaximumProblemGenericServices(E... array) {
       this.array = array;
    }

    public E maximumValue() {
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
        return array[array.length-1];
    }
}