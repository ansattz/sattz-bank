
public class Crew {

   public static void main(String[] args) {
      Employee henrique = new Employee();
      Employee mario = new Manager();
      Employee douglas = new Programmer();

      henrique.setSalary(1800);
      mario.setSalary(4000);
      douglas.setSalary(8500);

      BonusControl control = new BonusControl();

      // control.registry(henrique);
      // control.registry(mario);
      control.registry(douglas);

      System.out.println(control.getBonus());

      /*
       * System.out.println("Henrique's salary is "
       * + henrique.getSalary());
       * 
       * System.out.println("Henrique gained a bonus of "
       * + henrique.salaryBonus());
       * 
       * System.out.print("Henrique's salary is ");
       * System.out.println(henrique.salaryBonus() + henrique.getSalary());
       */
   }
}
