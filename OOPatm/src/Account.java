public class Account {
    private String account_number;
    private String name;
    private double balance;
    private String password;
    
    public Account(String account_number, String name, double balance, String password){
        this.account_number = account_number;
        this.balance = balance;
        this.name = name;
        this.password = password;
    }
    public void load (double value){
        this.balance+=value;
        System.out.println("New Balance = " + balance);    
    }
    public void withdraw(double value){
        if(value > 2000){
            System.out.println("Daily Limit Exceeded.Max value 2000 ");
        }
        else if (balance - value < 0 ){
            System.out.println("Insufficient Balance. Current Balance = " + this.balance);
        }
        else{
            balance -= value;
            System.out.println("New Balance = " + balance);
        }        
    }
    
    public String getAccount_number() {
        return account_number;
    }

   
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }    
}
