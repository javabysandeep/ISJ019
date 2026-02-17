package _02_preparedStatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static _02_preparedStatementDemos.MysqlConstants.*;

public class Demo1Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id");
        int productId = scanner.nextInt();

        System.out.println("enter the product name");
        String productName = scanner.next();

        System.out.println("Enter the product price");
        int productPrice = scanner.nextInt();

        String query = "insert into product(id, name, price) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, productId);
        preparedStatement.setString(2, productName);
        preparedStatement.setInt(3, productPrice);
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("row inserted successfully.");
    }
}
