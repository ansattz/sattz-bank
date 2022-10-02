package taxManagement;

import accountManagement.*;

public class Main {
   public static void main(String[] args) {

      CheckingAccount cc = new CheckingAccount(0001, 1337);
      cc.deposit(500.00);

      LifeInsurance lifei = new LifeInsurance();
      TaxMath calc = new TaxMath();

      calc.registry(cc);
      calc.registry(lifei);

      System.out.println(calc.getTotalTax());
   }
}
