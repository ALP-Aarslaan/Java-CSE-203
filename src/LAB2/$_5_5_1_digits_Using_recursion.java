import java.util.Scanner;

public class $_5_5_1_digits_Using_recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();
        digits(num);
    }
    public static void digits(int num) {
        if(num==0)
            return ;
            digits(num/10);
        int digit=num%10;
        System.out.println(digit);
    }
}