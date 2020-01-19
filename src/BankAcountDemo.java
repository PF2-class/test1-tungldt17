
public class BankAcountDemo {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setBalance(12);
		BankAccount b2 = new BankAccount(b1);
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
	}

}
