package com.zodiacleo.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Royals implements Team
{
    @Bean
    @Override
    public String getName()
    {
        return "Kansas City Royals";
    }
}
