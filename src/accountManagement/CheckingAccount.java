package accountManagement;

public class CheckingAccount extends Account {

   public CheckingAccount(int agency, int number) {
      super(agency, number);
   }

   @Override
   public boolean withdraw(double value) {
      return super.withdraw(value);
   }

   @Override
   public void deposit(double value) {
      // we need to protect the balance attribute
      // of the mae class in order to get access
      super.balance += value;
   }

}
