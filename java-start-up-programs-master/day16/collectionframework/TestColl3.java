package blue.day16.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class TestColl3 {

    /*
     * No size is fixed Dynamic in insertion - dynamic grow Heterogeneous datas
     * can be maintained..
     *
     * List: Maintains the Order of insertion Duplication allowed can get
     * Heterogeneous datas can restrict it with <generics>
     *
     * Set: Not maintain the Order of insertion No Duplication allowed can get
     * Heterogeneous datas can restrict it with <generics>
     *
     *
     * Map : combination of List & Set
     */
    HashMap hm = new HashMap();
    HashMap<Integer, String> hm2 = new HashMap<>();

    public void activity() {
        hm.put(100, "karthik");
        hm.put(101, "raja");
        hm.put(102, "kumar");
        hm.put(103, "kumar");
        
        System.out.println(hm);
    }

    public static void main(String[] args) {
        TestColl3 t3 = new TestColl3();
        t3.activity();
    }
}
