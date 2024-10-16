package com.vivekinc.learn_spring_framework;


import com.vivekinc.learn_spring_framework.game.GameRunner;
import com.vivekinc.learn_spring_framework.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
