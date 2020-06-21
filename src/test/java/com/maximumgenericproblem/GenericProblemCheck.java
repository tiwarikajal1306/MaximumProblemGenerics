package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;
import org.junit.Assert;
import org.junit.Test;

public class GenericProblemCheck {
    @Test
    public void givenThreeInteger_FirstPosition_ShouldReturnMaximum() {
        Integer[] Array = {30, 20, 10};
        Assert.assertEquals(Array[0],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeInteger_SecondPosition_ShouldReturnMaximum() {
        Integer[] Array = {20,30};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeInteger_ThirdPosition_ShouldReturnMaximum() {
        Integer[] Array = {10,20,80,50,45,76};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeFloat_FirstPosition_ShouldReturnMaximum() {
        Float[] Array = {30.5f,20.5f,10.5f};
        Assert.assertEquals(Array[0],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeFloat_SecondPosition_ShouldReturnMaximum() {
        Float[] Array = {20.5f,30.5f,10.5f,4.5f,9.0f};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeFloat_ThirdPosition_ShouldReturnMaximum() {
        Float[] Array = {10.5f,20.5f,30.5f};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_FirstPosition_ShouldReturnMaximum() {
        String[] Array={"Peach", "Banana", "Apple"};
        Assert.assertEquals(Array[0],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_SecondPosition_ShouldReturnMaximum() {
        String[] Array={"Banana", "Peach", "Apple","Mango"};
        Assert.assertEquals(Array[1],MaximumProblemGenericServices.maximumValue(Array));
    }
    @Test
    public void givenThreeString_ThirdPosition_ShouldReturnMaximum() {
        String[] Array={"Apple", "Banana", "Peach"};
        Assert.assertEquals(Array[2],MaximumProblemGenericServices.maximumValue(Array));
    }
}