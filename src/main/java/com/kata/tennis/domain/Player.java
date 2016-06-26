package com.kata.tennis.domain;

/**
 * Created by Aymen on 26/06/2016.
 */
public class Player {

    private String name;

    private int currentScore;

    public Player(String name) {
        this.name = name;
        this.currentScore = 0;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public void score(){
        this.currentScore++;
    }
}
