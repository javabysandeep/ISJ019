package _03_callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _02_preparedStatementDemos.MysqlConstants.*;

public class Demo1CreateProc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String query = "create procedure bulk_insert()\n" +
                "begin\n" +
                "\t\t\t\t\tinsert into product(name, price) values('dumm1',100);\n" +
                "\t\t\t\t\tinsert into product(name, price) values('dumm2',100);\n" +
                "\t\t\t\t\tinsert into product(name, price) values('dumm3',100);\n" +
                "\t\t\t\t\tinsert into product(name, price) values('dumm4',100);\n" +
                "\t\t\t\t\t\n" +
                "\t\t\tend\n";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("Procedure created");
    }
}
