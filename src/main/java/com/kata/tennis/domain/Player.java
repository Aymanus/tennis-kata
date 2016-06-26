package com.kata.tennis.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Aymen on 26/06/2016.
 */
public class Player {

    public static final List<Integer> scores = Arrays.asList(0, 15, 30, 40);

    private String name;

    private int currentScore;

    public Player(String name) {
        this.name = name;
        this.currentScore = 0;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void score(){
        this.currentScore++;
    }

    public int tennisScore(){
        return scores.get(currentScore);
    }

    public String getName() {
        return name;
    }
}
