package com.eduit.repository;

import org.springframework.stereotype.Component;

//@Component("connection")
public class Connection {

    private String connectionString;

    public Connection(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public String execSql(String sql){

        return "resultado sql";
    }
}
