package accountManagement;

public class Main {
   public static void main(String[] args) {
      Account douglas = new Account(1337, 59382);
      Account marcus = new Account(1233, 59430);

      CheckingAccount corrente = new CheckingAccount(121, 213);
      corrente.deposit(500);

      SavingsAccount poupanca = new SavingsAccount(122, 233);
      poupanca.deposit(800);

      poupanca.transfer(500, corrente);
      System.out.println(poupanca.withdraw(20));
      System.out.println(poupanca.getBalance());
      // douglas.deposit(500);
      // System.out.println("Balance on douglas's "
      // + "account before the "
      // + "transfer "
      // + "of 350 is " + douglas.getBalance());
      // System.out.println("Balance on marcus's "
      // + "account before the "
      // + "transfer is " + marcus.getBalance());

      // douglas.transfer(350, douglas, marcus);

      // System.out.println("Balance on marcus's "
      // + "account now " + marcus.getBalance());
      // System.out.println("Balance on douglas's "
      // + "account now " + douglas.getBalance());

      // System.out.println("The number of accounts created: " + Account.getTotal());

   }
}
