package com.maximumgenericproblem.services;

import com.maximumgenericproblem.MaximumProblemGeneric;

public class MaximumProblemGenericServices extends MaximumProblemGeneric {
    static Integer maximum = 0;
    public static Integer findMaximumNumber(Integer[] intArray) {
        for (Integer index : intArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }
    //LOGIC FOR FIND FLOAT MAXIMUM VALUE
    public static Float MaximumFloatValue(Float[] floatArray) {
        Float maximum=0f;
        for (Float index : floatArray) {
            if (index.compareTo(maximum) > 0) {
                maximum = index;
            }
        }
        return maximum;
    }
}
