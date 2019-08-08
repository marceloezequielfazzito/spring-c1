package com.eduit.configuration;

import com.eduit.repository.AutoRepository;
import com.eduit.repository.Connection;
import com.eduit.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.eduit")
public class SpringConfig {


    @Bean(name = "connectionOne")
    public Connection connectionOne(){
        return new Connection("jdbc://mysql//ip/base");
    }

    @Bean(name = "connectionTwo")
    public Connection connectionTwo(){
        return new Connection("jdbc://mysql//ip/base");
    }

    @Bean
    public ItemRepository itemRepository(@Qualifier("connectionOne") Connection connection){
        return new ItemRepository(connection);
    }

    @Bean
    public AutoRepository autoRepository(@Qualifier("connectionTwo")Connection connection){
        return new AutoRepository(connection);
    }


}
