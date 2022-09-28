package LAB8;

import java.util.Scanner;

public class RoomBookingApp {
    public static void main(String[] args) {
        RoomList room=new RoomList();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("enter 1 to add room : ");
            System.out.println("enter 2 to book room : ");
            System.out.println("enter 3 to cancel reservation : ");
            int num=scan.nextInt();
            if(num==1){
                System.out.println("enter room number : ");
                int roomNumber=scan.nextInt();
                System.out.println("enter room capacity : ");
                int roomCapacity=scan.nextInt();
                room.addRoom(roomNumber,roomCapacity);
            }
            else if(num==2){
                System.out.println("enter room number : ");
                int roomNumber= scan.nextInt();
                room.display(roomNumber);
                room.bookRoom(roomNumber);
            }
            else if(num==3){
                System.out.println("enter room number : ");
                int roomNumber=scan.nextInt();
                room.cancelBooking(roomNumber);
            }

        }
    }
}
