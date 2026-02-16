package _01_statementDemos;

import com.mysql.cj.jdbc.Driver;

public class Demo2ForName {
    public static void main(String[] args) throws ClassNotFoundException {
        //Student s = new Student();
        Class.forName("_01_statementDemos.Student");
    }

}
