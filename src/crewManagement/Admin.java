package crewManagement;

public class Admin extends Employee implements Auth {
   private AuthComp comp;

   public Admin() {
      this.comp = new AuthComp();
   }

   @Override
   public double salaryBonus() {
      return 445;
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
