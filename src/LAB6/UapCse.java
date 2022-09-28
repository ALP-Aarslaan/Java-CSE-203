package LAB6;

import java.util.ArrayList;

public class UapCse {
    ArrayList<Employee> employees=new ArrayList<>();
    String departmentName;
    UapCse(String departmentName){
        this.departmentName=departmentName;
    }
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    public void addNewEmployee(String nm, String id, String des, double sal){
        Employee e=new Employee(nm,id,des,sal);
        addNewEmployee(e);
    }
    private Employee findEmployee(String id){
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }
    public void increaseSalary(String id,double amt){
        for (int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
            if(e.getId().equals(id)&&amt>0){
                e.increaseSalary(amt);
            }
        }
    }
    double getSalary(String id) {
//        for (int i = 0; i < employees.size(); i++) {
//            Employee e = employees.get(i);
//            if (e.getId().equals(id)) {
//                return e.getSalary();
//            }
//        }
        Employee e=findEmployee(id);
        if(e!=null)
            return e.getSalary();
        System.out.println("employee not found");
        return 0;
    }
    void display(String id){
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
            if(e.getId().equals(id)){
                e.display();
            }
        }
    }
    void display(){
        for(int i=0;i<employees.size();i++){
            employees.get(i).display();
        }
    }
}
