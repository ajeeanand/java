
package blue.day16.collectionframework;

import java.util.HashSet;


public class TestColl2 {
    
    HashSet hs = new HashSet();
    
    public void activity(){
        hs.add("India");
        hs.add(33);
        hs.add("India");
        hs.add(67);
        hs.add('y');
        
        System.out.println(hs);
    }
    
    public static void main(String[] args) {
        TestColl2 tc2 = new TestColl2();
        tc2.activity();
    }
    
}
