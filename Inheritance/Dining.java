package InheritanceExercise;

public class Dining extends Home{


    Dining(int noOfTubelights, int nightbulbs, String roomName){
        super(noOfTubelights,nightbulbs,roomName);
    }

    void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
        super.noOfLights(noOfTubelights,nightbulbs,roomName);
        System.out.println("Number of Lights in Dining Hall including tubelights and nightbulbs " + (noOfTubelights+nightbulbs));
    }
}
