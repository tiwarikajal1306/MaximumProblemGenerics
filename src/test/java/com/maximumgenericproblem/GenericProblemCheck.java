package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;
import org.junit.Assert;
import org.junit.Test;

public class GenericProblemCheck {
    MaximumProblemGenericServices value;

    @Test
    public void givenThreeInteger_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] Array = {30, 20, 10};
        Assert.assertEquals(Array[0],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeInteger_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] Array = {20, 30, 10};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeInteger_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Integer[] Array = {20, 10, 30};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeFloat_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] floatArray = {40.0f, 5.0f, 30.0f};
        Assert.assertEquals(floatArray[0],MaximumProblemGenericServices.maximumValue(floatArray));
    }
    @Test
    public void givenThreeFloat_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] Array = {5.0f, 40.0f, 30.0f};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeFloat_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        Float[] Array = {5.0f, 30.0f, 40.0f};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_FirstPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] Array = {"Peach", "Banana", "Apple"};
        Assert.assertEquals(Array[0],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_SecondPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] Array = {"Banana", "Peach", "Apple"};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_ThirdPosition_ShouldReturnMaximum() {
        value = new MaximumProblemGenericServices();
        String[] Array = {"Banana", "Apple", "Peach"};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
}
