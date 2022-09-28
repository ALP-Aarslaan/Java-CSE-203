import java.util.Scanner;

public class $_5_3_Sum_of_even_array_elements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n=scan.nextInt();
        int array[]=new int[n];
        System.out.println("enter "+n+" array elements:");

        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("\n");
        int sum=0;
        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                sum=sum+array[i];
            }
        }
        System.out.println("sum of even elements:"+sum);
    }
}
