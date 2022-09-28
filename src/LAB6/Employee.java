package LAB6;

public class Employee {
    private String name,id,designation;
    private double salary;
    Employee(String name,String id,String designation,double salary){
        this.name=name;
        this.id=id;
        this.designation=designation;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }


    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    void increaseSalary(double amt){
        salary=salary+amt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
   void display(){
       System.out.println(this);
   }
}
