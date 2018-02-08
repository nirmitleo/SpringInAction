package com.zodiacleo.entities;

public interface Game
{
    public void setHomeTeam(Team team);
    
    public Team getHomeTeam();
    
    public void setAwayTeam(Team team);
    
    public Team getAwayTeam();
    
    public String playGame();
}
