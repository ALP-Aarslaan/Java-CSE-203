package LAB8;

public class Room {
    int roomNum;
    int roomCapacity;
    boolean isEmpty;

    public Room(int roomNum, int roomCapacity,boolean isEmpty) {
        this.roomNum = roomNum;
        this.roomCapacity = roomCapacity;
        this.isEmpty=isEmpty;
    }

    void display(){
        System.out.println("room number : "+roomNum);
        System.out.println("room capacity : "+roomCapacity);
        System.out.println("room status : "+isEmpty);
        System.out.println("\n");
    }
}
