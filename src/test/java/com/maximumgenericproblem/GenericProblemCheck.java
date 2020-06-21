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
    @Test
    public void givenThreeFloat_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] floatArray = {40.0f, 5.0f, 30.0f};
        Assert.assertEquals(floatArray[0],MaximumProblemGenericServices.MaximumFloatValue(floatArray));
    }
    @Test
    public void givenThreeFloat_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] floatArray = {5.0f, 40.0f, 30.0f};
        Assert.assertEquals(floatArray[1],MaximumProblemGenericServices.MaximumFloatValue(floatArray));
    }
    @Test
    public void givenThreeFloat_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] floatArray = {5.0f, 30.0f, 40.0f};
        Assert.assertEquals(floatArray[2],MaximumProblemGenericServices.MaximumFloatValue(floatArray));
    }
    @Test
    public void givenThreeString_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] stringArray = {"Peach", "Banana", "Apple"};
        Assert.assertEquals(stringArray[0],MaximumProblemGenericServices.MaximumStringValue(stringArray));
    }
    @Test
    public void givenThreeString_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] stringArray = {"Banana", "Peach", "Apple"};
        Assert.assertEquals(stringArray[1],MaximumProblemGenericServices.MaximumStringValue(stringArray));
    }
    @Test
    public void givenThreeString_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] stringArray = {"Banana", "Apple", "Peach"};
        Assert.assertEquals(stringArray[2],MaximumProblemGenericServices.MaximumStringValue(stringArray));
    }
}
