public class $_10_Lab_3_TestCar {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.enginePower=2.5F;
        myCar.start();
        myCar.accelerate();
        System.out.println(myCar.getSpeed());
    }
}
class Car{
    String model;
    int speed;
    float enginePower;
    void start(){
        speed=10;
    }
    void accelerate(){
        speed=speed*10;
    }
    void stop(){
        speed=0;
    }
    int getSpeed(){
        return speed;
    }

}
