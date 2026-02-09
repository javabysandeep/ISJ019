package _12_collection._02_setDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo7HashSetRemoval {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("ashutosh");
        set.add("shravani");
        set.add("sakshi");
        set.add("kamlini");
        set.add("tanuja");
        set.add("rushikesh");
        set.add("chetan");
        System.out.println(set);
        System.out.println("set size  = " + set.size());

        //clear()  ---> it will remove all the elements
        set.clear();
        System.out.println(set);
        System.out.println("set size  = " + set.size());

    }
}
