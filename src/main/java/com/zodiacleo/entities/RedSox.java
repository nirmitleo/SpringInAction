package com.zodiacleo.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RedSox implements Team
{
    @Bean
    @Override
    public String getName()
    {
        return "Boston Red Sox";
    }
}
