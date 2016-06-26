package com.kata.tennis.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Aymen on 26/06/2016.
 */
public class GameTest {

    private Player playerOne;
    private Player playerTwo;
    private Game game;

    @Before
    public void setup() {
        playerOne = new Player("PlayerOne");
        playerTwo = new Player("PlayerTwo");
        game = new Game(playerOne,playerTwo);
    }

    @Test
    public void game_should_start_with_score_of_0_0(){
        assertThat( game.getPlayerOneCurrentScore(), is(equalTo(0)));
        assertThat( game.getPlayerTwoCurrentScore(), is(equalTo(0)));
    }

    @Test
    public void game_should_start_with_score_of_1_0_when_player1_scores(){
        game.playerOneScore();
        assertThat( game.getPlayerOneCurrentScore(), is(equalTo(1)));
        assertThat( game.getPlayerTwoCurrentScore(), is(equalTo(0)));
    }

    @Test
    public void game_should_start_with_score_of_1_1_when_player1_scores(){
        game.playerOneScore();
        game.playerTwoScore();
        assertThat( game.getPlayerOneCurrentScore(), is(equalTo(1)));
        assertThat( game.getPlayerTwoCurrentScore(), is(equalTo(1)));
    }
}
