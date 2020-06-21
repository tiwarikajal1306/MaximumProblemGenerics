package com.maximumgenericproblem;

import com.maximumgenericproblem.services.MaximumProblemGenericServices;
import org.junit.Assert;
import org.junit.Test;

public class GenericProblemCheck {
    MaximumProblemGenericServices maximum;
    @Test
    public void givenThreeInteger_FirstPosition_ShouldReturnMaximum() {
         maximum = new MaximumProblemGenericServices(30,20,10);
        Assert.assertEquals(30,maximum.maximumValue());
    }
    @Test
    public void givenThreeInteger_SecondPosition_ShouldReturnMaximum() {
      maximum = new MaximumProblemGenericServices(30,40,10);
        Assert.assertEquals(40,maximum.maximumValue());
    }
    @Test
    public void givenThreeInteger_ThirdPosition_ShouldReturnMaximum() {
       maximum = new MaximumProblemGenericServices(20,10,40);
        Assert.assertEquals(40,maximum.maximumValue());
    }
    @Test
    public void givenThreeFloat_FirstPosition_ShouldReturnMaximum() {
       maximum = new MaximumProblemGenericServices(30.5,20.5,10.5);
        Assert.assertEquals(30.5,maximum.maximumValue());
    }
    @Test
    public void givenThreeFloat_SecondPosition_ShouldReturnMaximum() {
        maximum = new MaximumProblemGenericServices(20.5,30.5,10.5);
        Assert.assertEquals(30.5,maximum.maximumValue());
    }
    @Test
    public void givenThreeFloat_ThirdPosition_ShouldReturnMaximum() {
      maximum = new MaximumProblemGenericServices(10.5,20.5,30.5);
        Assert.assertEquals(30.5,maximum.maximumValue());
    }
    @Test
    public void givenThreeString_FirstPosition_ShouldReturnMaximum() {
        maximum = new MaximumProblemGenericServices("Peach","Banana","Apple");
        Assert.assertEquals("Peach",maximum.maximumValue());
    }
    @Test
    public void givenThreeString_SecondPosition_ShouldReturnMaximum() {
       maximum = new MaximumProblemGenericServices("Banana","Peach","Apple");
        Assert.assertEquals("Peach",maximum.maximumValue());
    }
    @Test
    public void givenThreeString_ThirdPosition_ShouldReturnMaximum() {
       maximum = new MaximumProblemGenericServices("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maximum.maximumValue());
    }
}
