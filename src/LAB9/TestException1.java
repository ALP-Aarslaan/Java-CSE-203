package LAB9;

import java.util.Scanner;

public class TestException1 {
    public static void main(String[] args) {
        try{
            Scanner scan= new Scanner(System.in);
            System.out.println("enter 2 integers : ");
            int a=scan.nextInt();
            int b=Integer.parseInt(scan.next().trim());
            int c=a/b;
            System.out.println("result : "+c);
            scan.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
