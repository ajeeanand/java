package blue.day5.objectorientation.realtime;

//Entity
public class Student {

    //direct attribute
    String sName;
    int rollNo;
    int m1, m2, m3;
    final static String collName = "PEC";
    //indirect attribute
    int total;
    double avg;

    public Student() {
    }

    public Student(String sName, int rollNo, int m1, int m2, int m3) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void findTotal() {
        total = m1 + m2 + m3;
    }

    public void findAvg() {
        avg = total / 3;
    }

    public void displayDetails() {
        System.out.println("Stud Name : " + sName);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Coll Name : " + collName);
    }

    public void callMethods() {
        this.findTotal();
        this.findAvg();
        this.displayDetails();
    }

    public static void main(String[] args) {
        Student ram = new Student();

        Student anu = new Student("Anupriya", 100, 67, 78, 99);
        anu.callMethods();

        Student rajesh = new Student("Rajesh", 101, 57, 78, 99);
        rajesh.callMethods();

        Student mani = new Student();
    }
}
