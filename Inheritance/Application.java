package Inheritance;

public class Application {
    public static void main(String[] args) {

        System.out.println("Each room's number of lights details as follows : \n");

        //here we are creating each child class's object and calling the method
        KitchenRoom kitchen = new KitchenRoom(4,1,"Kitchen");
        kitchen.noOfLights(4,1,"Kitchen");

        DiningRoom dining = new DiningRoom(1,1,"Dining");
        dining.noOfLights(1,1,"Dining");

        StudyRoom balcony = new StudyRoom(0,1,"Study");
        balcony.noOfLights(0,1,"Study");

    }
}
