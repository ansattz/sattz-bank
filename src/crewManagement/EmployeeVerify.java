package crewManagement;

public abstract class EmployeeVerify extends Employee {
   private int password;

   public void setPassword(int password) {
      this.password = password;
   }

   public boolean verify(int password) {
      if (this.password == password) {
         return true;
      } else {
         return false;
      }
   }
}
