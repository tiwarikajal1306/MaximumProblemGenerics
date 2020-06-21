package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;

public class MaximumProblemGeneric {
    public static void main(String[]args){
        //FOR INT VALUE
        Integer[] Array = {30, 20, 10};
        System.out.println (MaximumProblemGenericServices.maximumValue(Array));
       //FOR FLOAT VALUE
        Float[] Array2 = {40.0f, 5.0f, 30.f};
        System.out.println (MaximumProblemGenericServices.maximumValue(Array2));
        //For STRING VALUE
        String[] Array3 = {"Banana", "Peach", "Apple"};
        System.out.println(MaximumProblemGenericServices.maximumValue(Array3));
    }
}

