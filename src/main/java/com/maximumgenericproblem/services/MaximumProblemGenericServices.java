package com.maximumgenericproblem.services;

import com.maximumgenericproblem.MaximumProblemGeneric;

public class MaximumProblemGenericServices extends MaximumProblemGeneric {
      static Integer maximum = 0;
    public static <E extends Comparable>E maximumValue (E[] Array){
        E maximum=Array[0];
        for (E index:Array){
            if (index.compareTo(maximum)>0){
                maximum=index;
            }
        }
        return maximum;
    }
}