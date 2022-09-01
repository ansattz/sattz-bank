
public class Manager {
	private String name;
	private String cpf;
	private double salary;
	private int password;
	
	
	public double salaryBonus() {
		return this.salary * 0.27; 
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
