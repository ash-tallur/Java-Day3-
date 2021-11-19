package Abstraction;

public class CitiBank extends Bank{

    @Override
    public void getBankName() {
        System.out.println("Citi Bank");
    }

    @Override
    public float getRateOfInterest() {
        return (float) 6.9;
    }

    @Override
    public String getBankDenominations() {
        String denominations = "50,100,500,1000";
        return denominations;
    }
}
