package _12_collection._01_listDemos._01_arrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo10ArrayListRetrieval {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ashutosh");
        list.add("shravani");
        list.add("sakshi");
        list.add("kamlini");
        list.add("tanuja");
        list.add("rushikesh");
        list.add("chetan");

        //01. printing entire list
        System.out.println(list);

        //02. we can use get(index)
        System.out.println("02. we can use get(index)");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //03. use for loop with get method
        System.out.println("03. use for loop with get method");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        //04. use enhanced for loop
        System.out.println("04. use enhanced for loop");
        for (String str : list) {
            System.out.println(str);
        }

        //05. use Iterator
        System.out.println("05. use Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
