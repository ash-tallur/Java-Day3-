package Abstraction;

public class Main {
    public static void main(String[] args) {
        Bank standard = new StandardChartered();
        standard.getBankName();
        System.out.println("Their rate of interest is " + standard.getRateOfInterest() + "%");
        System.out.println("Denominations available are :Rs." + standard.getBankDenominations());

        Bank union = new UnionBankOfIndia();
        union.getBankName();
        System.out.println("Their rate of interest is " + union.getRateOfInterest() + "%");
        System.out.println("Denominations available are :Rs." + union.getBankDenominations());

        Bank citi = new CitiBank();
        citi.getBankName();
        System.out.println("Their rate of interest is " + citi.getRateOfInterest() + "%");
        System.out.println("Denominations available are :Rs." + citi.getBankDenominations());
    }


}
