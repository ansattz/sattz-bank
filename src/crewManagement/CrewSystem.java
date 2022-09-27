package crewManagement;

public class CrewSystem {
   private int password = 2022;

   public void verify(EmployeeVerify ev) {
      boolean verified = ev.verify(this.password);
      if (verified) {
         System.out.println("Pode entrar no sistema!");
      } else {
         System.out.println("Nao pode entrar no sistema!");
      }
   }
}
