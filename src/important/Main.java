package important;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> linkedList1 = new LinkedList<String>();
        ArrayList<String > arrayList = new ArrayList<String>();

        arrayList.add("test");
        arrayList.add("qtp");
       arrayList.add("selinuim");
        arrayList.add("hfhfhfhf");

        linkedList1.add("test");
        linkedList1.add("qtp");
        linkedList1.add("selinuim");
        linkedList1.add("hfhfhfhf");

        linkedList1.addFirst("first");
        linkedList1.addLast("last");

        arrayList.add("first");
        arrayList.add("last");


        System.out.println("ll ===> "+ linkedList1);
        System.out.println("al ===> "+ arrayList );

        System.out.println("ll e  ===> "+ linkedList1.get(3));
        System.out.println("al e ===> "+ arrayList.get(3) );

        linkedList1.set(3, "third");
         arrayList.set(3, "third ");

        System.out.println("ll e  ===> "+ linkedList1);
        System.out.println("al e ===> "+ arrayList );

///////////////////////////// map collection ///////////////////
    }
}
