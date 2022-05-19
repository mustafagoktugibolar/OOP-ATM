public class Main {
    public static void main (String args []){
        Atm atm = new Atm();
        Account account = new Account("123456789","Mustafa Goktug Ibolar",2000,"123123");
        
        atm.work(account);
        System.out.println("Exiting...");
    }    
}
