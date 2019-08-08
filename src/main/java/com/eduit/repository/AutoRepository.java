package com.eduit.repository;

public class AutoRepository implements GenericRepository {


    private Connection connection;

    public AutoRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String getAll() {
        System.out.println("AutoRepository");
        return connection.execSql("select * from tabla");
    }
}
