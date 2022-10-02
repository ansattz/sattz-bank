package crewManagement;

public class AuthComp {
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
