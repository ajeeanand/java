package blue.day6.inheritance;

public class SubClass extends SuperClass {
    
    public void activityThree() {
        System.out.println("Three Activity");
        
    }
     public void activityFour() {
        System.out.println("Four Activity");
    }
    
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.activityThree();
        sc.activityFour();
        sc.doingActivityOne();
        sc.doingActivityTwo();
    }
}
