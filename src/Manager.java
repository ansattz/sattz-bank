// Manager > Employee
public class Manager extends Employee {
	private int password;
	
	public void setPassword(int password) {
		// setter password
		this.password = password;
	}
	
	public boolean verify(int password) {
		// verify if the output of the setter setPassword
		if(this.password == password) {
			return true;
		}else {
			return false;
		}
	}
	
	public double salaryBonus() {
		return super.salaryBonus() + super.getSalary();
		// super: specifies that the attribute salary
		// is from the Employee class
	}
}
