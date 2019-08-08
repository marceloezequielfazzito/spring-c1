package com.eduit;


import com.eduit.configuration.SpringConfig;
import com.eduit.repository.AutoRepository;
import com.eduit.repository.Connection;
import com.eduit.repository.GenericRepository;
import com.eduit.repository.ItemRepository;
import com.eduit.service.ItemService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        /*
        ApplicationContext applicationContext = ApplicationContext.instance();
        applicationContext.add("conection",new Connection("jdbc://mysql//ip/base") );
        Connection connection = (Connection) ApplicationContext.instance().get("conection");
        ItemRepository itemRepository = new ItemRepository(connection);
        applicationContext.add("itemRepository",itemRepository );

        ItemRepository itemRepository1 = (ItemRepository) ApplicationContext.instance().get("itemRepository");
        System.out.println(itemRepository1.getAll());*/

  /*
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


       Connection connection = context.getBean("connection",Connection.class);

        System.out.println(connection.getConnectionString());
        System.out.println(connection.execSql("select * from something"));


        ItemRepository itemRepository = context.getBean("itemRepository" , ItemRepository.class);

        System.out.println(itemRepository);
*/




       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Connection connection = context.getBean("connectionOne",Connection.class);

        System.out.println(connection.getConnectionString());
        System.out.println(connection.execSql("select * from something"));

        ItemRepository itemRepository = context.getBean("itemRepository" , ItemRepository.class);

        System.out.println(itemRepository.getAll());


        ItemService itemService = context.getBean(ItemService.class);

        System.out.println(itemService.getAll());


        GenericRepository genericRepository = context.getBean(ItemRepository.class);

        genericRepository.getAll();

        genericRepository = context.getBean(AutoRepository.class);

        genericRepository.getAll();




    }
}
