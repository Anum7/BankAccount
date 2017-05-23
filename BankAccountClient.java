
public class BankAccountClient {

	public static void main(String[] args) {
		BankAccount B1= new BankAccount();
		B1.name= "John";
	    B1.balance= 1000;
		
		B1.deposit(500);
		B1.displayBalance(B1.name, B1.balance);
		B1.withdraw(300);
		B1.displayBalance(B1.name, B1.balance);
		
		BankAccount B2= new BankAccount();
		String initialN= B1.name;
		double initialB= B1.balance;
		
		B2.displayBalance(initialN, initialB);
		
	}
	

}
