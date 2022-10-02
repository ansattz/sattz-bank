package crewManagement;

public abstract class Employee {
   // with the abstract i'm forcing this
   // class to be just a concept to be applied
   // to derived classes.
   // the compiled does not allow instantiating
   // an object of this class.
   private String name;
   private String cpf;
   protected double salary;
   // protected: public for child classes;
   // only child class of Employee can
   // access this as public

   public abstract double salaryBonus();
   // this method has no implementation
   // abstract method defines only the signature
   // (visibility, return, method name and parameters).

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }
}
