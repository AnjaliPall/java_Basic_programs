package Oops_concepts;

public class BankAccount_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank_Account b1 = new Bank_Account(8765329,"MNITJAIPUR",100382);
      
      b1.displayCurrentBalance();
      b1.withdraw(2000);
	  b1.displayCurrentBalance();
	  b1.deposit(-4000);
	  b1.displayCurrentBalance();
	  b1.deposit(70000);
	  b1.displayCurrentBalance();
	}

}
