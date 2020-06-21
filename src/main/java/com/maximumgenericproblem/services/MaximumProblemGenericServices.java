package com.maximumgenericproblem.services;

import com.maximumgenericproblem.MaximumProblemGeneric;

public class MaximumProblemGenericServices <E extends Comparable> extends MaximumProblemGeneric {
    //public class Maximum<E extends Comparable> {
        E firstVariable;
        E secondVariable;
        E thirdVariable;

        //DECLARED PARAMETERIZED CONSTRUCTOR
        public MaximumProblemGenericServices(E firstVariable, E secondVariable, E thirdVariable) {
            this.firstVariable = firstVariable;
            this.secondVariable = secondVariable;
            this.thirdVariable = thirdVariable;
        }

        public <E extends Comparable> E maximumValue() {

            if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
                return (E) firstVariable;
            else if (secondVariable.compareTo(firstVariable) > 0 && secondVariable.compareTo(thirdVariable) > 0)
                return (E) secondVariable;
            else
                return (E) thirdVariable;
        }
    }
//}