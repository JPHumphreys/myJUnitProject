package com.qa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Test
    public void mainTest()
    {
        app = new App();
        String newString = app.returnInput("Henlo", "WOW");
        assertTrue(newString, newString == "Henlo" || newString == "WOW");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
