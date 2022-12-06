package com.example.guestbook;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DataSourceProvider {
    private static DataSource dataSource;

    private DataSourceProvider() { }

    static DataSource getDataSource() throws NamingException {
        if (dataSource == null) {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env/");
            dataSource = (DataSource) envContext.lookup("jdbc/guestbook");
        }
        return dataSource;
    }
}
