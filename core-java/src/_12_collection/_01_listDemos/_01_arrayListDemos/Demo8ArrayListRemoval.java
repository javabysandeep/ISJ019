package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo8ArrayListRemoval {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ashutosh");
        list.add("shravani");
        list.add("sakshi");
        list.add("kamlini");
        list.add("tanuja");
        list.add("rushikesh");
        list.add("chetan");
        System.out.println(list);
        System.out.println("list size  = "+list.size());

        //01. remove(object)
        //02. remove(index)
        //03. removeAll(collection),
        //04. retainAll(retainCollection)
        //05. clear()
        //06. removeIf(predicate) ---> removes element based on a condition
        Predicate<String> predicate = input->input.startsWith("s");

        //this will remove all elements from the list which satisfies predicate
        list.removeIf(predicate);//removes elements which starts s


        System.out.println(list);
        System.out.println("list size  = "+list.size());

    }
}
