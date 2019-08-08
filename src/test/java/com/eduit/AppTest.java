package com.eduit;

import static org.junit.Assert.assertTrue;

import com.eduit.configuration.SpringConfig;
import com.eduit.repository.Connection;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppTest {

    private static ApplicationContext context;

    @BeforeClass
    public static void beforeClass(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }


    @Test
    public void shouldConnect() {
        //given
        Connection  connection = context.getBean("connectionOne",Connection.class);
        //when
        String sql = connection.execSql("select * from something");
        //then
        Assert.assertEquals("jdbc://mysql//ip/base",connection.getConnectionString());
        Assert.assertEquals("resultado sql",sql);
    }

}
