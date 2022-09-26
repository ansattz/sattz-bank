package crewManagement;

public class BonusControl {
   private double bonus;

   public void registry(Employee e) {
      // I dont know which employee will be passed here
      // ill just apply the salaryBonus() on the employee
      // and he will get the bonus of his kind.
      // This means that i will alocate
      // every employee in their
      // correct bonification.
      this.bonus = this.bonus + e.salaryBonus();
   }

   public double getBonus() {
      // call me and get your bonus.
      return bonus;
   }
}
