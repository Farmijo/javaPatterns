package com.example.patterns;

import org.junit.Test;
import org.junit.Assert;
public class BuilderTest {

    @Test
    public void just_one_breadSlice() throws Exception {
        var sandwich = new Sandwich.Builder(1).cheeseSlices(2).build();
        Assert.assertEquals(1, sandwich.breadSlices);
    }
}