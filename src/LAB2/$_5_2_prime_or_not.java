import java.util.Scanner;

public class $_5_2_prime_or_not {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scan.nextInt();
        isPrime(num);
    }
    public static void isPrime(int num){
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
            }
        if (flag==1)
                System.out.println("Not Prime");
        else
            System.out.println("Prime");
        }
    }

