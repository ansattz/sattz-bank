package accountManagement;

public class SavingsAccount extends Account {

   public SavingsAccount(int agency, int number) {
      super(agency, number);
   }

   @Override
   // annotation: this means that you want to
   // override this method
   public boolean withdraw(double value) {
      double taxa = value + 0.20;
      // we want to apply a fee for this
      // account
      return super.withdraw(taxa);
      // we'll use super to use the original method
      // from the Account class.
   }

   @Override
   public void deposit(double value) {
      this.balance += value;
   }
}
