package First_Package;

//public class type {
//
//			  private double balance = 500.00;
//			  public double getBalance(int accountId) {
//			    // logic here
//			    return balance;
//			  }
//			  public static void main(String[] args) {
//			   type accnt = new type();
//			    double value = accnt.getBalance(123456);
//			    System.out.println(accnt.balance);
//			    System.out.println("The balance is: " + value);
//			    
//			    
//			  }
//			}

public class type {
	  private double balance = 500.00;
	  public double getBalance(int accountId) {
	    // logic here
	    return balance - 100;
	  }
	  public static void main(String[] args) {
	    type accnt = new type();
	    double value = accnt.getBalance(123456);
	    System.out.println(accnt.balance);
	    System.out.println("The balance is: " + value);
	  }
	}

		