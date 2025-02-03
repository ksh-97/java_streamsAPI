package collection.list;

import java.util.ArrayList;
import java.util.List;

public class arraylist_impl {
    public static void main(String[] args) {
//         Default capacity of arraylist is 10 else pass capacity also
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(null);
        list.add("E");
        System.out.println(list);
//        Defining initial size
        List<String> list1 = new ArrayList<>(25);

//        Copy arraylist
        List<String> listcpy = new ArrayList<>(list);
        System.out.println("listcopy : " +listcpy);
//        Append
        listcpy.addAll(list);
        System.out.println("listcopy : " + listcpy);

//        methods
        System.out.println(list.isEmpty());
        System.out.println(list1.isEmpty());

//        Modifying an index
        listcpy.set(2, "ZZZ");
        System.out.println("listcopy after modification: " + listcpy);

//        Removing an index
        listcpy.remove(2);
        System.out.println("listcopy after removal: " + listcpy);



    }
}
