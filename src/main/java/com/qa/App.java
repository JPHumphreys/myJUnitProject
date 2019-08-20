package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }

    public String returnInput(String input1, String input2)
    {
        int inputRandom = (int) (Math.random() * 2) + 1;

        if(inputRandom < 2)
        {
            return input1;
        }
        else
        {
            return input2;
        }
    }



}
