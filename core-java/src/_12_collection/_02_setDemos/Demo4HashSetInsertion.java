package _12_collection._02_setDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo4HashSetInsertion {
    public static void main(String[] args) {
        Set set = new HashSet();

        //01. add a single element set
        set.add(100);
        System.out.println(set);


        //02. add multiple values
        List list1 = new ArrayList();
        list1.add("abc");
        list1.add("xyz");

        set.addAll(list1);
        System.out.println(set);


    }
}
