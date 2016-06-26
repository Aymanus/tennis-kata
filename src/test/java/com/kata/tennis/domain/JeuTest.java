package com.kata.tennis.domain;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Aymen on 26/06/2016.
 */
public class JeuTest {

    private Jeu jeu;

    @Before
    public void setup() {
        jeu = new Jeu();
    }

    @Test
    public void jeu_should_start_with_0(){
        assertThat( jeu.getScore(), is(equalTo(0)));
    }
}
