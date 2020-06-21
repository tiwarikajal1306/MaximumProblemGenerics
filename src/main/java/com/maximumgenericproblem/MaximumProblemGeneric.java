package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;

public class MaximumProblemGeneric {
    public static void main(String[]args){
        MaximumProblemGenericServices maximum=new MaximumProblemGenericServices(30,40,10);
        System.out.println (maximum.maximumValue());
        MaximumProblemGenericServices maximumFloatValue=new MaximumProblemGenericServices(30.5,40.5,10.5);
        System.out.println(maximumFloatValue.maximumValue());
        MaximumProblemGenericServices maximumStringValue = new MaximumProblemGenericServices("Banana","Apple","Peach");
        System.out.println(maximumStringValue.maximumValue());
    }
}

