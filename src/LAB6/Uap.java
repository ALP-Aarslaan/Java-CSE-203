package LAB6;

import java.util.Scanner;

public class Uap {
    public static void main(String[] args) {
        UapCse myUap=new UapCse("CSE");
        Scanner scan =new Scanner(System.in);

        while(true){
            System.out.println("Input ‘1’ to add a new Employee.");
            System.out.println("Input ‘2’ to get Salary info of a specific Employee.");
            System.out.println("Input ‘3’ to increase the salary of an Employee.");
            System.out.println("Input ‘4’ to display the details of a specific Employee.");
            System.out.println("Input ‘5’ to display the list of the Employees.");
            System.out.println("Input ‘0’ to exit the system.");
            System.out.print("enter here : ");
            int num=scan.nextInt();
            if(num==1){
                scan.nextLine();
                System.out.println("enter employee name : ");
                String name=scan.nextLine();
                System.out.println("enter employee id : ");
                String id=scan.next();
                System.out.println("enter employee designation : ");
                String designation=scan.next();
                System.out.println("enter employee salary : ");
                double salary=scan.nextDouble();
                myUap.addNewEmployee(name,id,designation,salary);
            }
            if(num==2){
                System.out.println("enter employee id : ");
                String id=scan.next();
                myUap.getSalary(id);
                System.out.println(myUap.getSalary(id));
            }
            if(num==3){
                System.out.println("enter employee id : ");
                String id=scan.next();
                System.out.println("enter increased amount of salary : ");
                double amount=scan.nextDouble();
                myUap.increaseSalary(id,amount);
            }
            if(num==4){
                System.out.println("enter employee id : ");
                String id=scan.next();
                myUap.display(id);
            }
            if(num==5){
                myUap.display();
            }
            if(num==0){
                System.exit(0);
            }
        }
    }
}
