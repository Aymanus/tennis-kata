package com.kata.tennis.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Aymen on 26/06/2016.
 */
public class PlayerTest {

    private Player player;

    @Before
    public void setup() {
        player = new Player("Player One");
    }

    @Test
    public void player_should_start_with_score_of_0(){
        assertThat( player.getCurrentScore(), is(equalTo(0)));
    }
}
