package CT1;

public class $ct1_q1 {
    public static void main(String[] args) {
    employee1 emp=new employee1();
    emp.name="Jahid";
    emp.employeeId="123";
    emp.salary=10000;
    emp.display();
    emp.increaseSalary(500);
   // emp.getSalary();
    }
}
class employee1{
    String name,employeeId;
    double salary;
    void increaseSalary(double amt){
        salary=salary+amt;
    }
    double getSalary(){
        //salary=salary;
        return salary;
    }
    void display(){
        System.out.printf("%s--%s--%.2f",name,employeeId,salary);
    }

}