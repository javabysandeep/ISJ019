package _12_collection._06_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //List.of(10, 20, 99, 81, 1, 34) gives immutable list
        List<Integer> list = new ArrayList<>(List.of(10, 20, 99, 81, 1, 34));
        System.out.println("before sorting");
        System.out.println(list);


        Collections.sort(list);// list of type comparable

        System.out.println("after sorting");
        System.out.println(list);
    }
}
