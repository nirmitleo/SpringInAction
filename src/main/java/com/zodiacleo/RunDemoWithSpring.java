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
        Game game = context.getBean("game", Game.class);
        
        System.out.println("The winner of the game 1 is " + game.playGame());
        
        
        Team royals = context.getBean("royals", Team.class);
        game.setAwayTeam(royals);
        System.out.println("The winner of the game 2 is " + game.playGame());
        
        int count = context.getBeanDefinitionCount();
        System.out.println("Total bean count = " + count);
        
        String[] names = context.getBeanDefinitionNames();
        for (String name : names)
        {
            System.out.println("Bean name: " + name);
        }
    }
}
