package com.example;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {
    @Test
    public void testApp() {
        App app = new App();
        Assert.assertFalse(app.myMethod());
    }
}
