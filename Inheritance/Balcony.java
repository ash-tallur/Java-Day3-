package InheritanceExercise;

public class Balcony extends Home{

    Balcony(int noOfTubelights, int nightbulbs, String roomName){
        super(noOfTubelights,nightbulbs,roomName);
    }

    void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
        super.noOfLights(noOfTubelights,nightbulbs,roomName);
        System.out.println("Number of Lights in Balcony including tubelights and nightbulbs " + (noOfTubelights+nightbulbs));
    }
}
