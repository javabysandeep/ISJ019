package _3_classComponents.nestedClasses;

public class Constants {
    static class Mysql {
        static class Dev {
            public static String username = "mysql_dev";
            public static String password = "mysql_dev_pass";
        }

        static class QA {
            public static String username = "mysql_qa";
            public static String password = "mysql_qa_pass";
        }

        static class Prod {
            public static String username = "mysql_prd";
            public static String password = "mysql_prd_pass";
        }
    }

    static class Oracle {
        static class Dev {
            public static String username = "oracle_dev";
            public static String password = "oracle_dev_pass";
        }

        static class QA {
            public static String username = "oracle_qa";
            public static String password = "oracle_qa_pass";
        }

        static class Prod {
            public static String username = "oracle_prd";
            public static String password = "oracle_prd_pass";
        }
    }
}
