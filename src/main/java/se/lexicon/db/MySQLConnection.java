package se.lexicon.db;

import java.sql.Connection;

public class MySQLConnection {
    private static final String JDBC_USER = "root";
    private static final String JDBC_PWD = "root1234";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/world";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = java.sql.DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection   ;
    }
}
