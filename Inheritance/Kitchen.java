package InheritanceExercise;

public class Kitchen extends Home{

      Kitchen(int noOfTubelights, int nightbulbs, String roomName){
           super(noOfTubelights,nightbulbs,roomName);
      }

      void noOfLights(int noOfTubelights,int nightbulbs,String roomName){
          super.noOfLights(noOfTubelights,nightbulbs,roomName);
          System.out.println("Number of Lights in Kitchen including tubelights and nightbulbs " + (noOfTubelights+nightbulbs));
      }
}
