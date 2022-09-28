import java.util.Scanner;

public class $_5_4_factorial_using_recursion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=scan.nextInt();
        System.out.println("factorial  :"+fact(n));
    }
    public static int fact(int num){
        if(num==1)
            return 1;
        else
            return num*fact(num-1);
    }

}
