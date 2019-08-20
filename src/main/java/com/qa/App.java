package com.qa;
import java.util.Scanner;
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

       while(player.getDealState())
       {
           Scanner scanner = new Scanner(System.in);  // Create a Scanner object
           System.out.println("Player current score : " + player.getScore());
           System.out.println("Dealer current score : " + dealer.getScore());
           System.out.println("Hit or Stick (h/s)");
           String option = scanner.nextLine();

           if(option.equals("s"))
           {
               player.setDealState();
           }
           else if(option.equals("h"))
           {
               //keep true
           }
           else
           {
               player.setDealState();
               System.out.println("there was an error in the input");
           }

           if(player.getDealState())
           {
               //check scores vs <16-21>
               player.dealCards(newCard());
           }
       }

       //auto the dealer.
       while(dealer.getDealState())
       {
           dealer.dealCards(newCard());
       }

       System.out.println(Player.winnerQuery2(player.getScore(), dealer.getScore()));
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
