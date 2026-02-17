package _02_preparedStatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static _02_preparedStatementDemos.MysqlConstants.*;

public class Demo3Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id to be deleted");
        int productId = scanner.nextInt();


        String query = "delete from product where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, productId);
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("row deleted successfully.");
    }
}
