package _04_metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _02_preparedStatementDemos.MysqlConstants.*;

public class Demo1Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connected to the database");
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        System.out.println(databaseMetaData.getDriverName());
        System.out.println(databaseMetaData.getMaxConnections());
        System.out.println(databaseMetaData.getUserName());

        connection.close();
        System.out.println("Database Connection closed.");
    }
}
