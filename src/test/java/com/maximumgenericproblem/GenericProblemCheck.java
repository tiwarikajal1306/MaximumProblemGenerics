package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;
import org.junit.Assert;
import org.junit.Test;

public class GenericProblemCheck {
    MaximumProblemGenericServices value;

    @Test
    public void givenThreeInteger_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] intArray = {30, 20, 10};
        Assert.assertEquals(intArray[0],MaximumProblemGenericServices.findMaximumNumber(intArray));
    }
}
