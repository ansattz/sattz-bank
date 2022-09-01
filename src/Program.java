
public class Program {
	public static void main(String[] args) {
		Account douglas = new Account(1337, 59382);
		Account marcus = new Account(1233, 59430);
		
		douglas.deposit(500);
		System.out.println("Balance on douglas's "
				+ "account before the "
				+ "transfer "
				+ "of 350 is " + douglas.getBalance());
		System.out.println("Balance on marcus's "
				+ "account before the "
				+ "transfer is " + marcus.getBalance());
		
		douglas.transfer(350, douglas, marcus);
		
		System.out.println("Balance on marcus's "
				+ "account now " + marcus.getBalance());
		System.out.println("Balance on douglas's "
				+ "account now " + douglas.getBalance());

	}
}