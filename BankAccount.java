
public class BankAccount {
   String name;
   double balance;
   
   public void deposit(double amount){
	   balance= balance+ amount;
   }
   public void withdraw (double amount){
	   balance= balance - amount;
   }
   public void displayBalance(String name, double balance){
	   System.out.println(name+ ",$"+ balance);
   }
}
