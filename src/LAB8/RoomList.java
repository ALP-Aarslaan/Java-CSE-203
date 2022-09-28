package LAB8;
public class RoomList {
    Room[] rooms =new Room[20];
    void addRoom(int roomNumber,int roomCapacity){

        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null&&roomNumber==rooms[i].roomNum) {
                rooms[i].isEmpty=true;
                rooms[i].roomCapacity=roomCapacity;
                rooms[i].roomNum=roomNumber;
            }

        }
    }
    void bookRoom(int roomNumber){
        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null&&roomNumber==rooms[i].roomNum){
                rooms[i].isEmpty=false;
                System.out.println(i+" number room is booked");
            }
        }
    }

    void display(int roomNumber){
        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null&&rooms[i].roomNum==roomNumber) {
                rooms[i].display();
            }
        }
    }

    void cancelBooking(int roomNumber){
        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null&&roomNumber==rooms[i].roomNum){
                rooms[i].isEmpty=true;
                System.out.println(i+" number room is now available ");
            }
        }
    }
}
