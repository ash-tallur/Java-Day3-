package Abstraction;

abstract class Bank {

     abstract String getBankName();
     abstract float getRateOfInterest();
     abstract String getBankDenominations();

}

class StandardBank extends Bank {

     @Override
     String getBankName(){
          return "Standard Chartered Bank";
     }

     @Override
     float getRateOfInterest(){
          return (float) 5.7;
     }

     @Override
     String getBankDenominations(){
          return "denominations they have are Rs.100,500,2000";
     }

}

class CitiBank extends Bank {

     @Override
     String getBankName(){
         return "Citi Bank";
     }

     @Override
     float getRateOfInterest(){
          return (float) 7.2;
     }

     @Override
     String getBankDenominations(){
          return "denominations they have are Rs.500,2000";
     }

}

class AxisBank extends Bank{
     @Override
     String getBankName(){
          return "Axis Bank";
     }

     @Override
     float getRateOfInterest(){
          return (float) 6.8;
     }

     @Override
     String getBankDenominations(){
          return "denominations they have are Rs.50,100,500,2000";
     }

}

class CheckBankDetails{

     public static void main(String[] args) {
          Bank bankDetail;
          bankDetail = new StandardBank();
          System.out.println(bankDetail.getBankName() + "'s rate of interest is " + bankDetail.getRateOfInterest() + "%p.a and " + bankDetail.getBankDenominations());

          bankDetail = new CitiBank();
          System.out.println(bankDetail.getBankName() + "'s rate of interest is " + bankDetail.getRateOfInterest() + "%p.a and " + bankDetail.getBankDenominations());

          bankDetail = new AxisBank();
          System.out.println(bankDetail.getBankName() + "'s rate of interest is " + bankDetail.getRateOfInterest() + "%p.a and " + bankDetail.getBankDenominations());
     }


}






