package _12_collection._02_linkedListDemos;

import java.util.LinkedList;

public class Demo4LinkedListRemoval {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
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

        //clear()  ---> it will remove all the elements
        list.clear();
        System.out.println(list);
        System.out.println("list size  = "+list.size());

    }
}
