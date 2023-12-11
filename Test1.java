package First_Package;
public class Test1 {
  private double balance = 500.00;
  public double  getBalance(int accountId) {
    // logic here
    return balance;
  }
  public static void main(String[] args) {
    Test1 accnt = new Test1();
    double value = accnt.getBalance(123456);
    System.out.println("The balance is: " + value);
  }
}

