package _12_collection._02_setDemos;

import java.util.*;

public class Demo10HashSetRetrieval {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ashutosh");
        set.add("shravani");
        set.add("sakshi");
        set.add("kamlini");
        set.add("tanuja");
        set.add("rushikesh");
        set.add("chetan");

        //01. printing entire set
        System.out.println(set);

        //we cannot use get(index)

        //02. use enhanced for loop
        System.out.println("02. use enhanced for loop");
        for (String str : set) {
            System.out.println(str);
        }

        //03. use Iterator
        System.out.println("03. use Iterator");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //04. java 8 forEach Method
        System.out.println("04. java 8 forEach method");
        set.forEach(System.out::println);

    }
}
