package crewManagement;

public class Manager extends EmployeeVerify{
   public double salaryBonus() {
      System.out.println("Manager received");
      return super.getSalary();
      // super: specifies that the attribute salary
      // is from the Employee class
   }
}
