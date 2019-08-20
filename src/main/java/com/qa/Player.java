package com.qa;

public class Player {

    private int score;
    private boolean deal;

    Player(int score1, int score2)
    {
        this.score += score1;
        this.score += score2;
    }

    public int getScore()
    {
        return score;
    }

    public void addScore(int score)
    {
        if(score == 11 && score > 10)
        {
            score = 1;
        }
        this.score += score;
    }

    public boolean getDealState()
    {
        return deal;
    }

    public void dealCards(int score)
    {
        while(deal)
        {
            if (this.score < 16) {
                addScore(score);
            } else if (this.score > 21) {
                //bust
                deal = false;
            } else {
                //between 16 and 21.
                deal = false;
            }
        }
    }

    public static String winnerQuery(int playerScore, int dealerScore)
    {
        if(playerScore > dealerScore)
        {
            return "Player wins with a score of : " + playerScore;
        }
        if(playerScore == dealerScore)
        {
            return "Player and dealer draw with a score of : " + playerScore;
        }
        else
        {
            return "Dealer wins with a score of : " + dealerScore;
        }
    }

}
