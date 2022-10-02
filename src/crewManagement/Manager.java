package crewManagement;

public class Manager extends Employee implements Auth {
   private AuthComp comp;

   public Manager() {
      this.comp = new AuthComp();
   }

   public double salaryBonus() {
      System.out.println("Manager received");
      return super.getSalary();
      // is from the Employee class
   }

   @Override
   public void setPassword(int password) {
      this.comp.setPassword(password);
   }

   @Override
   public boolean verify(int password) {
      return this.comp.verify(password);
   }
}
