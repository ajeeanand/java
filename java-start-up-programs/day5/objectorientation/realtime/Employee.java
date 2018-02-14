package blue.day5.objectorientation.realtime;

public class Employee {

    //non static property - instance variables
    String eName;
    int empId;
    double basicPay;
    double hra;
    double da;
    double pf;
    //indirect attribute
    double grossPay;
    //static variable - class variable
    final static String compName = "NISSAN";

    public Employee(String eName, int empId, double basicPay, double hra, double da, double pf) {
        this.eName = eName;
        this.empId = empId;
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
        this.pf = pf;
    }

    public Employee() {
    }

    public void findGrossPay() {
        grossPay = (basicPay + hra + da) - pf;
    }

    public void displayDetails() {
        System.out.println("Emp Name : " + eName);
        System.out.println("Emp Id : " + empId);
        System.out.println("Company Name : " + Employee.compName);
        System.out.println("Gross pay : " + grossPay);
    }

    public void methodCalls() {
        this.findGrossPay();
        this.displayDetails();
    }

    public static void main(String[] args) {

        Employee raj = new Employee("RajKumar", 101, 14000, 1500, 500, 200);
        raj.methodCalls();

        Employee kumar = new Employee("Kumaresan", 102, 150000, 7865, 8967, 200000);
        kumar.methodCalls();
    }
}
