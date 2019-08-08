package com.eduit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository("itemRepository")
public class ItemRepository implements GenericRepository {

    private Connection connection;

    //@Autowired
    public ItemRepository(Connection connection) {
        this.connection = connection;
    }

    public String getAll(){
        System.out.println("ItemRepository");
        return connection.execSql("select * from tabla");
    }
}
