package Abstraction;

public class StandardChartered extends Bank{

    @Override
    public void getBankName() {
        System.out.println("Standard Chartered Bank");
    }

    @Override
    public float getRateOfInterest() {
        return (float) 5.4;
    }

    @Override
    public String getBankDenominations() {

        String denominations = "50,1000,2000";
        return denominations;
    }
}
