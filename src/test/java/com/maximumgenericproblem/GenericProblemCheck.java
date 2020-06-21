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
    @Test
    public void givenThreeInteger_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] intArray = {20, 30, 10};
        Assert.assertEquals(intArray[1],MaximumProblemGenericServices.findMaximumNumber(intArray));
    }
    @Test
    public void givenThreeInteger_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] intArray = {20, 10, 30};
        Assert.assertEquals(intArray[2],MaximumProblemGenericServices.findMaximumNumber(intArray));
    }
}
