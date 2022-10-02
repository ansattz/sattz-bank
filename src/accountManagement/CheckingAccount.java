package accountManagement;

import taxManagement.Tax;

public class CheckingAccount extends Account implements Tax {

   public CheckingAccount(int agency, int number) {
      super(agency, number);
   }

   @Override
   public boolean withdraw(double value) {
      double valueToGet = value + 0.2;
      return super.withdraw(valueToGet);
   }

   @Override
   public void deposit(double value) {
      // we need to protect the balance attribute
      // of the mae class in order to get access
      super.balance += value;
   }

   @Override
   public double getTaxValue() {
      return super.balance * 0.02;
   }
}
