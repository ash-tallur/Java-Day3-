package Inheritance;

public class Room {

    static int noOfTubelights;
    static int nightbulbs;
    static String roomName;

    //setting a parameterised constructor for the variables
    Room(int noOfTubelights, int nightbulbs, String roomName){
        this.roomName = roomName;
        this.noOfTubelights = noOfTubelights;
        this.nightbulbs = nightbulbs;
    }

    //The method which says about the different lights in a room
    void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
        System.out.println("Number of tubelights in " + roomName + " " + noOfTubelights);
        System.out.println("Number of nightbulbs in " + roomName + " " + nightbulbs);
    }
}
