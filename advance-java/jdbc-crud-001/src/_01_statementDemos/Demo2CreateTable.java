package _01_statementDemos;

import java.sql.*;

public class Demo2CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        01. add the connector[Driver] jar to the project
        02. load and register the Driver with DriverManager
                - this is done automatically in java 8
            - explicitly
            Class.forName("driver-path");

        03. Get the connection from DriverManager by passing url, username, password
        04. Create teh Statement type object using Connection
        05. execute the query using statement reference
        06. use the result
        07. close the connection

        * */
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj018";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        statement.execute("create table product(id int primary key auto_increment, name varchar(100), price int);");
        System.out.println("table created successfully");
        connection.close();
    }
}
