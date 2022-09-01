
public class Crew {

	public static void main(String[] args) {
		Employee henrique = new Employee();
		Employee ricardo = new Employee();
		henrique.setSalary(1800);
		ricardo.setSalary(2500);
		
		Manager mario = new Manager();
		mario.setPassword(209040);
		
		System.out.println(mario.verify(209042));
		System.out.println(mario.verify(209040));

/*		System.out.println("Henrique's salary is "
				+ henrique.getSalary());
		
		System.out.println("Henrique gained a bonus of "
				+ henrique.salaryBonus());
		
		System.out.print("Henrique's salary is ");
		System.out.println(henrique.salaryBonus() + henrique.getSalary());
*/
	}
}
