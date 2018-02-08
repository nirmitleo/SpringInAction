package com.zodiacleo;

import com.zodiacleo.entities.Game;
import com.zodiacleo.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemoWithSpring
{
    public static void main(String[] a)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Team royals = context.getBean("royals", Team.class);
        
        Game game1 = context.getBean("game", Game.class);
        System.out.println(game1);
        System.out.println("The winner of the game 1 is " + game1.playGame());
        
        Game game2 = context.getBean("game", Game.class);
        game2.setAwayTeam(royals);
        System.out.println(game2);
        System.out.println("The winner of the game 2 is " + game1.playGame());
        
        System.out.println(game1);
    }
}
