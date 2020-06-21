package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;

public class MaximumProblemGeneric {
    public static void main(String[]args){
        Integer[] intArray = {30, 20, 10};
        System.out.println (MaximumProblemGenericServices.findMaximumNumber(intArray));
    }
}

