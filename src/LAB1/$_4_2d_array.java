import java.util.Scanner;

public class $_4_2d_array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a[][]=new int[3][];
        a[0]= new int[]{1};
        a[1]=new int[]{1,2};
        a[2]=new int[]{1,2,3};
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print( " "+a[i][j]);
            }
            System.out.println();
        }
        int b[][]=new int[3][3];
        System.out.println("enter array elements:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.println(b[i][j]);
            }
        }
    }
}

