package com.codeclan.example.rpsgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/03/2017.
 */

public class TestGame {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void testCheckHands() {
        assertEquals("scissors wins", game.checkHands("paper", "scissors"));
    }
}
