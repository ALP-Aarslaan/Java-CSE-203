import java.util.Scanner;

public class $_5_2_Even_Odd_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter an integer:");
        int n=scan.nextInt();
        isEven(n);
    }
    public static void isEven(int n){
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}