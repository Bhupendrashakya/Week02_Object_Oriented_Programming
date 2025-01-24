//import java.util.ArrayList;
//
//class Accounts{
//    private int accountNumber;
//    private int balance;
//
//    public Accounts(int accountNumber, int balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//    public void DisplayAccountDetails(){
//        System.out.println("Account number is :"+accountNumber+" And balance is :"+balance);
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//}
//class Customer{
//    private String customerName;
//    ArrayList<Accounts> accounts;
//
//    public Customer(String customerName) {
//        this.customerName = customerName;
//        this.accounts = new ArrayList<>();
//    }
//
//    public void addAccount(Accounts account)
//    {
//        accounts.add(account);
//        System.out.println("Added account: " + account.getAccountNumber() + " to customer: " + customerName);
//    }
//
//    public void ViewBalance(){
//        for(Accounts account:accounts){
//            account.DisplayAccountDetails();
//        }
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//}
//class Bank{
//    private String name;
//    ArrayList<Customer> customers;
//
//    public Bank(String name) {
//        this.name = name;
//        this.customers = new ArrayList<>();
//    }
//    public void openAccount(Customer customer ,Accounts accounts){
//     customer.addAccount(accounts);
//     if (!customers.contains(customer)){
//         customers.add(customer);
//         System.out.println("Customer "+customer.getCustomerName()+" to bank "+name);
//     }
//    }
//
//    public void displayAllCustomers() {
//        System.out.println(name + " has the following customers:");
//        for (Customer customer : customers) {
//            System.out.println("Customer: " + customer.getCustomerName());
//            customer.ViewBalance();
//        }
//    }
//
//
//}
//public class Problem2 {
//    public static void main(String[] args) {
//        Bank b1=new Bank("SBI");
//
//        Accounts a1=new Accounts(123456789,15682);
//        Accounts a2=new Accounts(3465489,1544682);
//        Accounts a3=new Accounts(1236787,15657882);
//        Accounts a4=new Accounts(1234489,1567782);
//        Accounts a5=new Accounts(45600789,1565582);
//
//        Customer c1=new Customer("Alice");
//        Customer c2=new Customer("mayank");
//        Customer c3=new Customer("raaj");
//        b1.openAccount(c1,a1);
//        b1.openAccount(c2,a2);
//        b1.openAccount(c3,a3);
//        b1.openAccount(c3,a3);
//        b1.displayAllCustomers();
//        Bank b2=new Bank("ICCI");
//              b2.openAccount(c3,a4);
//              b2.openAccount(c2,a5);
//              b2.displayAllCustomers();
//
//    }
//}
