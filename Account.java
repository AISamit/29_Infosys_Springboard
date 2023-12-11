package First_Package;
public class Account {
	  private double balance = 500.00;  // instance variable
	  static int minimumBalance = 200;  // static variable
	  public double getBalance(int accountId) {
	    int withdrawal = 500;           // local variable
	    System.out.println("withdrawal is "+withdrawal);
	    return balance - withdrawal;
	  }
	  public static void main(String[] args) {
	    Account accnt = new Account();
	    double value = accnt.getBalance(123456);
	    System.out.println(accnt.balance);
	    System.out.println("The balance is " + value);
	    System.out.println();
	  }
	}
	      
