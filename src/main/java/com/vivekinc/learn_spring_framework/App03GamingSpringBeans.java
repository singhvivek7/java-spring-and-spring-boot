package com.vivekinc.learn_spring_framework;

import com.vivekinc.learn_spring_framework.game.GameRunner;
import com.vivekinc.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {
       try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
           var game = context.getBean(GamingConsole.class);
           game.up();

           context.getBean(GameRunner.class).run();

        }
    }
}
