package crewManagement;

public class AuthSystem {
   private int password = 2022;

   public void verify(Auth personToverify) {
      boolean verified = personToverify.verify(this.password);
      if (verified) {
         System.out.println("Authenticated!");
      } else {
         System.out.println("Invalid Password!");
      }
   }
}
