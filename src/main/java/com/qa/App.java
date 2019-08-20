package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Player player = new Player(newCard(), newCard());
        Player dealer = new Player(newCard(), newCard());
        //check scores vs 16

        while(player.getDealState())
        {
            player.dealCards(newCard());
        }
        while(dealer.getDealState())
        {
            dealer.dealCards(newCard());
        }

        System.out.println(Player.winnerQuery(player.getScore(), dealer.getScore()));
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

    public static int newCard()
    {
        return (int)(Math.random() * 11) + 1;
    }



}
