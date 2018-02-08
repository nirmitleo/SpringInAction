package com.zodiacleo;

import com.zodiacleo.entities.BaseballGame;
import com.zodiacleo.entities.Game;
import com.zodiacleo.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.zodiacleo")
public class AppConfig
{
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private List<Team> teams;
    
    @Bean
//    @Scope("prototype")
    public Game game()
    {
        System.out.println("************");
        System.out.println(teams.getClass());
        for (int i = 0; i < teams.size(); i++)
        {
            System.out.println(teams.get(i));
        }
        System.out.println("************");
        BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1));
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
}
