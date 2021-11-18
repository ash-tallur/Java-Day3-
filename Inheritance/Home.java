package InheritanceExercise;

public class Home {

    int noOfTubelights;
    int nightbulbs;
    String roomName;

    Home(int noOfTubelights,int nightbulbs,String roomName){
        this.roomName = roomName;
        this.noOfTubelights = noOfTubelights;
        this.nightbulbs = nightbulbs;
    }

    void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
        System.out.println("Number of tubelights in " + roomName + " " + noOfTubelights);
        System.out.println("Number of nightbulbs in " + roomName + " " + nightbulbs);
    }
}
