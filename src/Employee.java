
public class Employee {
	private String name;
	private String cpf;
	protected double salary;
	// public for child class
	// only child class of Employee can access this as public
	
	public double salaryBonus() {
		return this.salary * 0.1; 
	}
	
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
