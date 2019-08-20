package com.qa;

import static org.junit.Assert.assertEquals;
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
        assertTrue(newString, newString.equals("Henlo")|| newString.equals("WOW"));

        assertEquals(Player.winnerQuery(18,21), "Dealer wins");
        assertEquals(Player.winnerQuery(18,18), "Player and dealer draw");
        assertEquals(Player.winnerQuery(21,18), "Player wins");



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
