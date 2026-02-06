package _12_collection._05_wrapper;

public class Demo2 {
    public static void main(String[] args) {

        //parseXXX ---> string into corresponding primitive
        byte parsedByte = Byte.parseByte("1");
        short parseShort = Short.parseShort("12");
        int parseInt = Integer.parseInt("123");
        long parseLong = Long.parseLong("1245");
        System.out.println(parsedByte);
        System.out.println(parseShort);
        System.out.println(parseInt);
        System.out.println(parseLong);

        //valueOf ---> primitive or string to object
        Integer integer = Integer.valueOf(1);
        Integer integer1 = Integer.valueOf("12");
        System.out.println(integer);
        System.out.println(integer1);

    }
}
