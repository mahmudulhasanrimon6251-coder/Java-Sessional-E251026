interface ATMService {
 void deposit(double a);
 void withdraw(double a);
 void checkBalance();
}
class DBBL implements ATMService {
 double balance;
 DBBL(double b) {
 balance = b;
 }
 public void deposit(double a) {
 balance += a;
 }
 public void withdraw(double a) {
 balance -= a;
 }
 public void checkBalance() {
 System.out.println(balance);
 }
}
class Main2 {
 public static void main(String[] args) {
 DBBL a = new DBBL(1000);
 a.deposit(500);
 a.withdraw(300);
 a.checkBalance();
 }
}