package LAB3;

public class $_9_Lab_3_TestLamp {
    public static void main(String[] args) {
        Lamp myLamp=new Lamp();
        myLamp.power=2.5F;
        myLamp.turnOn();
        myLamp.turnOff();
        myLamp.isOn();
        System.out.println(myLamp.getPower());

    }
}
class Lamp{
    float power;
    boolean isOn;
    void turnOn(){
        isOn=true;
    }
    void turnOff(){
        isOn=false;
    }
    float getPower(){
        return power;
    }
    boolean isOn(){
        return isOn;
    }
}