package Abstraction;

public class UnionBankOfIndia extends Bank{

    @Override
    public void getBankName() {
        System.out.println("Union Bank of India ");
    }

    @Override
    public float getRateOfInterest() {
        return (float) 7.4;
    }

    @Override
    public String getBankDenominations() {
        String denominations = "500,2000";
        return denominations;
    }
}
