package Inheritance;

public class DiningRoom extends Room {

    //calling a parameterised constructor which is basically calling the base class constructor using super
    DiningRoom(int noOfTubelights, int nightbulbs, String roomName){
        super(noOfTubelights,nightbulbs,roomName);
    }

    //Here overriding the method which is been inherited
    void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
        super.noOfLights(noOfTubelights,nightbulbs,roomName);
        System.out.println("Number of Lights in " + roomName + " including tubelights and nightbulbs are " + (noOfTubelights+nightbulbs) + "\n");
    }
}
