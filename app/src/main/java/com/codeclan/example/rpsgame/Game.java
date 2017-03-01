package com.codeclan.example.rpsgame;

/**
 * Created by user on 01/03/2017.
 */

public class Game {

//    Game game = new Game();


    public String checkHands(String hand1, String hand2) {

        if (hand1 == hand2) {
            return "Draw";

        }if (hand1.equals("rock") && (hand2.equals("scissors"))) {
            return "rock wins";

        }else if (hand1 == "paper" && hand2 == "scissors") {
            return "scissors wins";

        }else if (hand1 == "paper" && hand2 == "rock") {
            return "paper wins";

        }else if (hand1 == "scissors" && hand2 == "paper") {
            return "scissors wins";
        }
        else if(hand1 == "scissors"&& hand2 == "rock");
            return "rock wins";
        }

}