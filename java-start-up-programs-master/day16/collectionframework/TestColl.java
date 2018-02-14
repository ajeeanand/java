package blue.day16.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestColl {

    ArrayList al = new ArrayList();
    LinkedList ll = new LinkedList();
    //Generics <Integer>

    public void activity() {
//        al.add(100);
//        al.add("hello");
//        al.add(55.6);
//        al.add(true);
//        al.add('h');
//        al.add("India");
//        al.add("India");
//        
//        
//        System.out.println(al);
        
//        
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }

        ll.add(33);
        ll.add("India");
        ll.add(55.5);
        ll.add('a');
        ll.add(2, "Holy");

        System.out.println(ll);


        Iterator ir = ll.iterator();

        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    public static void main(String[] args) {
        TestColl tc = new TestColl();
        tc.activity();
    }
}
