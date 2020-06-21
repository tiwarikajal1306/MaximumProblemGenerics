package com.maximumgenericproblem.services;

import com.maximumgenericproblem.MaximumProblemGeneric;

public class MaximumProblemGenericServices extends MaximumProblemGeneric {
    public static <E extends Comparable> E maximumValue(E[] Array) {
        int length = Array.length;
        E temp;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i].compareTo(Array[j]) > 0) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        E max = null;
        for (int i = 0; i < Array.length; i++) {
            max = null;
            max = Array[i];
        }
        return max;
    }
}