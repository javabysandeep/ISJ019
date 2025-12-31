package _3_classComponents.nestedClasses;

public class Demo4 {
    public static void main(String[] args) {
        //access constants of Mysql
        System.out.println("***********mysql************");
        System.out.println("mysql dev username=" + Constants.Mysql.Dev.username);
        System.out.println("mysql dev password=" + Constants.Mysql.Dev.password);

        System.out.println("mysql qa username=" + Constants.Mysql.QA.username);
        System.out.println("mysql qa password=" + Constants.Mysql.QA.password);

        System.out.println("mysql prod username=" + Constants.Mysql.Prod.username);
        System.out.println("mysql prod password=" + Constants.Mysql.Prod.password);

    }
}
