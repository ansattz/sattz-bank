package crewManagement;

public class Manager extends Employee {
   private int password;

   public void setPassword(int password) {
      // setter password
      this.password = password;
   }

   public boolean verify(int password) {
      // bolean method ill verify the output of
      // the setter setPassword method
      if (this.password == password) {
         return true;
      } else {
         return false;
      }
   }

   public double salaryBonus() {
      System.out.println("Manager received");
      return super.getSalary();
      // super: specifies that the attribute salary
      // is from the Employee class
   }
}
