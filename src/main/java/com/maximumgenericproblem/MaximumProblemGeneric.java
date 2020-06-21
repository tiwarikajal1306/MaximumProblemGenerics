package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;

public class MaximumProblemGeneric {
    public static void main(String[] args) {
        Integer[] Array = {20, 30, 10,70,56};
        System.out.println("Maximum Integer value is" + " " + MaximumProblemGenericServices.maximumValue(Array));
        Float[] Array1 = {30.5f, 20.5f, 10.5f,40.3f,60.5f};
        System.out.println("Maximum Float value is" + " " + MaximumProblemGenericServices.maximumValue(Array1));
        String[] Array2 = {"Mango","Banana","Apple","Greps","Peach"};
        System.out.println("Maximum String value is" + " " + MaximumProblemGenericServices.maximumValue(Array2));
    }
}

