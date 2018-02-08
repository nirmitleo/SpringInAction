package com.zodiacleo.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

public class BaseballGame implements Game
{
    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;
    
    public BaseballGame()
    {
    }
    
    public BaseballGame(Team homeTeam, Team awayTeam)
    {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    @PostConstruct
    public void startGame()
    {
        System.out.println("*************Before the start of the game*************");
    }
    
    @PreDestroy
    public void endGame()
    {
        System.out.println("*************After the end of the game*************");
    }
    
    @Override
    public String playGame()
    {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }
    
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }
    
    @Override
    public Team getHomeTeam()
    {
        return homeTeam;
    }
    
    @Override
    public void setHomeTeam(Team homeTeam)
    {
        this.homeTeam = homeTeam;
    }
    
    @Override
    public Team getAwayTeam()
    {
        return awayTeam;
    }
    
    @Override
    public void setAwayTeam(Team awayTeam)
    {
        this.awayTeam = awayTeam;
    }
    
    @Override
    public String toString()
    {
        return String.format("Game between %s and %s", homeTeam.getName(), awayTeam.getName());
    }
}
