package crewManagement;

public class CrewSystem {
   private int password = 2022;

   public void verify(EmployeeVerify employeeToverify) {
      boolean verified = employeeToverify.verify(this.password);
      if (verified) {
         System.out.println("Authenticated!");
      } else {
         System.out.println("Invalid Password!");
      }
   }
}
