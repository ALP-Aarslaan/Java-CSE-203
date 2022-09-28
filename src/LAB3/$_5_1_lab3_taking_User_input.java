import javax.swing.*;

public class $_5_1_lab3_taking_User_input {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog(null,"Enter an integer:");
        int num=Integer.parseInt(input);
        isEven(num);

    }
    public static void isEven(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else
            System.out.println("Odd");
    }
}
