import java.util.Scanner;

public class $_5_6_pattern_of_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,space,s,col,col1,n;
        System.out.println("enter how many rows you want:");
        n=scan.nextInt();
        space=n-1;
        if(n>9)
        n=9;
        {
            for(row=1;row<=n;row++){
                for(s=space;s>0;s--){
                    System.out.print(" ");
                }
                for(col=1;col<=row;col++){
                    System.out.print(col);
                }
                for(col1=col-2;col1>=1;col1--){
                    System.out.print(col1);
                }
                space--;
                System.out.println();
            }
        }
    }
}

