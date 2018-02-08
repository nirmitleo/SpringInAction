package com.zodiacleo;

import com.zodiacleo.entities.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemoWithSpring
{
    public static void main(String[] a)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Game game = context.getBean("game", Game.class);
        System.out.println(game);
        System.out.println("The winner of the game 1 is " + game.playGame());
        
        context.close();
    }
}
