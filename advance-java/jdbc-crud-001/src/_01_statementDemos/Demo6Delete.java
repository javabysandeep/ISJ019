package _01_statementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Delete {
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

        String query = "delete from product where id=3";
        statement.executeUpdate(query);
        System.out.println("row deleted successfully");
        connection.close();
    }
}
