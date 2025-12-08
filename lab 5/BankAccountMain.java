class BankAccount {
int accountNumber;
String accountHolderName;
double balance;
static String bankName = "Sonali Bank";
BankAccount(int accNum, String name, double bal) {
accountNumber = accNum;
accountHolderName = name;
balance = bal;
}
void displayAccountInfo() {
System.out.println("Bank Name: " + bankName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Balance: " + balance);
}
static void showBankName() {
System.out.println("Bank Name: " + bankName);
}
}

public class BankAccountMain {
public static void main(String[] args) {
BankAccount account1 = new BankAccount(101, "Labib", 50000);
BankAccount account2 = new BankAccount(102, "Nazim", 70000);
account1.displayAccountInfo();
System.out.println();
account2.displayAccountInfo();
BankAccount.showBankName();
}
}