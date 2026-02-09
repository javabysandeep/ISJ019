package _12_collection._02_setDemos;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Demo8HashSetRemoval {
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
        System.out.println("set size  = " + set.size());

        // removeIf(predicate) ---> removes element based on a condition
        Predicate<String> predicate = input -> input.startsWith("s");

        //this will remove all elements from the set which satisfies predicate
        set.removeIf(predicate);//removes elements which starts s


        System.out.println(set);
        System.out.println("set size  = " + set.size());

    }
}
