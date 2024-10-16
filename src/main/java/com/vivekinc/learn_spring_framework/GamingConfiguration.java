package com.vivekinc.learn_spring_framework;

import com.vivekinc.learn_spring_framework.game.GameRunner;
import com.vivekinc.learn_spring_framework.game.GamingConsole;
import com.vivekinc.learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }


}
