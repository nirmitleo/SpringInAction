package com.zodiacleo.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cubs implements Team
{
    @Bean
    @Override
    public String getName()
    {
        return "Chicago Cubs";
    }
}
