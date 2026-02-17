package _03_callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _02_preparedStatementDemos.MysqlConstants.*;

public class Demo3DropProc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String query = "drop procedure isj018.bulk_insert";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("Procedure dropped");
    }
}
