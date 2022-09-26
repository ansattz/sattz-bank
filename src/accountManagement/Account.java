package accountManagement;

public class Account {
   // this class has private attributes [encapsulation]
   private Client holder; // Testing objects composition
   private int agency;
   private int number;
   private double balance;
   private static int total;

   public Account(int agency, int number) {
      // constructor
      // to create an object(an account)
      // the object must have two entries.
      total++; // static attribute that will count the number of accounts created
      System.out.println("Number of accounts created: " + Account.total);
      this.agency = agency;
      this.number = number;
      System.out.println("A new account created with number " + this.number);
   }

   public void deposit(double value) {
      // void means that ill not
      // return nothing but I'm doing something with it,
      // in this case its a method to update
      // the balance of [this] account [the object].
      this.balance += value;
   }

   public boolean withdraw(double value) {
      // Withdraw method that returns a boolean
      if (this.balance >= value) {
         // if the balance of this account is greater or equal than the value...
         this.balance -= value;
         // this value is equal the
         // original value minus the value input
         return true;
      } else {
         return false;
      }
   }

   public boolean transfer(double value, Account toReceive) {
      // this method has 2 arguments: the value of the transference,
      // and the account that will receive the
      // money
      if (this.withdraw(value)) {
         toReceive.deposit(value);
         return true;
      } else {
         return false;
      }
   }

   public double getBalance() {
      // getter applied on balance attribute
      // method to show the value of the balance
      return this.balance;
   }

   public int getNumber() {
      // getter applied on number attribute
      // method to show the number of the account
      return this.number;
   }

   public int getAgency() {
      // getter applied on agency attribute
      // method to show the agency of the account
      return this.agency;
   }

   public static int getTotal() {
      // static method to show the total account created
      return Account.total;
   }

}
