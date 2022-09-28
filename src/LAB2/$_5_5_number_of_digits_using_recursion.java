import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class $_5_5_number_of_digits_using_recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();
        int i=0;
        int array[]=new int[10];
        while (num > 0) {
            int r=num%10;
            array[i]=r;
            i++;
            num=num/10;
            }
        for( i=i-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}



