
package blue.discussion;


public class Employee {
    
    String eName;
    int eId;
    int basicPay;
    double hra,da,pf,grossPay;
    
    public void grossPay(){
    grossPay=basicPay+hra+da-pf;
    }
    public Employee(String eName,int eId, int basicPay, double hra, double da,double pf){
            this.eName=eName;
            this.eId=eId;
            this.basicPay=basicPay;
            this.hra=hra;
            this.da=da ;
            this.pf=pf;
    }

    public void show(){
    
        System.out.println(eName);
        System.out.println(eId);
        System.out.println(basicPay);
        System.out.println(hra);
        System.out.println(da);
        System.out.println(pf);
        System.out.println(grossPay);
        
    }
    
    
    
    public static void main(String args[]) {
     
        Employee moni = new Employee("Monisha",1,20000,4000,300,100);
        moni.grossPay();
        moni.show();
        
        Employee ajeet = new Employee("Ajeet",2,60000,6000,300,100);
        ajeet.grossPay();
        ajeet.show();
        
        Employee milo = new Employee("Milo",1,40000,5000,300,100);
        milo.grossPay();
        milo.show();
    }
}
