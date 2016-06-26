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

    public int tennisScore(){
        if(currentScore == 1)
            return 15;
        if(currentScore == 2)
            return 30;
        if(currentScore == 3)
            return 40;
        return 0;
    }

    public String getName() {
        return name;
    }
}
