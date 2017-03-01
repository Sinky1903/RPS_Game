package com.codeclan.example.rpsgame;

import java.util.ArrayList;

/**
 * Created by user on 01/03/2017.
 */

public class Player {

    String name;
    ArrayList<Weapon> playerchoice;

    public Player(String name) {
        this.name = name;
        playerchoice = new ArrayList<Weapon>();
    }


}
