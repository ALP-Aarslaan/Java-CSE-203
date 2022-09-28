package CT2;

public class Employee {
    public String name;
    public double salary;
    //private double salary;
    public  Employee(String n,double m){
        this.name=n;
        this.salary=m;

    }
    void setSalary(double newSal){
        salary=newSal;
    }
}
class testEmployee{
    public static void main(String[] args) {
        Employee emp=new Employee("Misam",20000);
        System.out.println("name : "+emp.name + "salary : "+emp.salary);
        emp.setSalary(30000);
    }

}
