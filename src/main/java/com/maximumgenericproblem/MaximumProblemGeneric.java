package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;

public class MaximumProblemGeneric {
    public static void main(String[]args){
        //FOR INT VALUE
        Integer[] intArray = {30, 20, 10};
        System.out.println (MaximumProblemGenericServices.findMaximumNumber(intArray));
       //FOR FLOAT VALUE
        Float[] floatArray = {40.0f, 5.0f, 30.f};
        System.out.println (MaximumProblemGenericServices.MaximumFloatValue(floatArray));
        //For STRING VALUE
        String[] stringArray = {"Banana", "Peach", "Apple"};
        System.out.println(MaximumProblemGenericServices.MaximumStringValue(stringArray));
    }
}

