package com.zodiacleo;

import com.zodiacleo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.zodiacleo")
public class AppConfig
{
    @Autowired
    private DataSource dataSource;
    
    @Resource(name = "redSox")
    private Team home;
    
    @Resource(name = "cubs")
    private Team away;
    
    @Bean
    public Game game()
    {
        BaseballGame baseballGame = new BaseballGame(home, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
    
    @Bean
    public Team redSox()
    {
        return new RedSox();
    }
    
    @Bean
    public Team cubs()
    {
        return new Cubs();
    }
}
