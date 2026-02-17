package _01_statementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj018";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name");
        String productName = scanner.next();
        System.out.println("Enter the product price");
        int productPrice = scanner.nextInt();

        String query = "insert into product(name, price) values('" + productName + "'," + productPrice + ")";
        statement.executeUpdate(query);
        System.out.println("row inserted successfully");
        connection.close();
    }
}
