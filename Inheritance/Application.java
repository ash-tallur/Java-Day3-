package InheritanceExercise;

public class Application {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen(4,1,"Kitchen");
        kitchen.noOfLights(4,1,"Kitchen");

        Dining dining = new Dining(1,1,"Dining Hall");
        dining.noOfLights(1,1,"Dining Hall");

        Balcony balcony = new Balcony(0,1,"Balcony");
        balcony.noOfLights(0,1,"Balcony");

    }
}
