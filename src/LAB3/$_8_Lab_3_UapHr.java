package LAB3;

public class $_8_Lab_3_UapHr {
    public static void main(String[] args) {
        Employee emp1=new Employee("Jonayed","19101019","teacher",5000);
        System.out.println("Salary :"+emp1.salary);
        emp1.updateSalary(2000);
        emp1.display();
        Employee emp2=new Employee("alvi ","1234","teacher",5000);
        System.out.println(emp2.salary);
        emp2.updateSalary(3000);
        System.out.println(emp2.salary);
        emp2.display();
    }
}
class Employee{
    String name,id,designation;
    double salary;
    Employee(String name,String id,String designation,double salary){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.id=id;
    }
    void updateSalary(double newSal){
        salary=salary+newSal;
    }

    double getSalary(){
        return salary;
    }
    void display(){
        System.out.println("name : ["+name+"]");
        System.out.println("Id : ["+id+"]");
        System.out.println("Designation : ["+designation+"]");
        System.out.println("Salary : ["+salary+"]");
    }
}
