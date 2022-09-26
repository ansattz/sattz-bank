package crewManagement;

public class Programmer extends Employee {
   // salaryBonus for programmer role gets +150 extra
   public double salaryBonus() {
      System.out.println("Programmer received");
      return 150;
   }
}
