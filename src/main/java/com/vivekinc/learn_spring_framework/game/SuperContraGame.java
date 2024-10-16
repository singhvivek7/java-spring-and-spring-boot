package com.vivekinc.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Seat down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}