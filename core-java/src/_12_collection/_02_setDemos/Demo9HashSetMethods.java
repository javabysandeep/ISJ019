package _12_collection._02_setDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo9HashSetMethods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ashutosh");
        set.add("shravani");
        set.add("sakshi");
        set.add("kamlini");
        set.add("tanuja");
        set.add("rushikesh");
        set.add("chetan");
        System.out.println(set);
        System.out.println(set.isEmpty());


    }
}
