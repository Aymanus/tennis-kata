package com.kata.tennis.domain;

/**
 * Created by Aymen on 26/06/2016.
 */
public class Game {

    private Player playerOne;
    private Player playerTwo;

    private int score;

    public Game(Player player1, Player player2) {
        this.playerOne = player1;
        this.playerTwo = player2;
    }

    public int getScore() {
        return score;
    }

    public int getPlayerOneCurrentScore(){
        return playerOne.getCurrentScore();
    }

    public int getPlayerTwoCurrentScore(){
        return playerTwo.getCurrentScore();
    }

    public void playerOneScore(){
        this.playerOne.score();
    }

    public void playerTwoScore(){
        this.playerTwo.score();
    }
}
