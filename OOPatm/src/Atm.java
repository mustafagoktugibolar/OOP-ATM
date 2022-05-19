import java.util.Scanner;
public class Atm {
    public void work(Account account){
        Login login = new Login();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Welcome...");
        System.out.println("****************************");
        System.out.println("User Login ");
        System.out.println("****************************");
        int entry_right = 3;
        
        
        while(true){
            if(login.login_method(account)){
                System.out.println("Login Successful");
                break;
            } 
            else{
                entry_right-=1;
                System.out.println("Login Failed... ");
                System.out.println("Entry Right = " + entry_right);               
            }
            if(entry_right == 0){
                System.out.println("Entry Rights Ended");
                return;
            }
        }
        
        
        System.out.println("*********************************");
        String processes = "1. Show Balance\n"
                          + "2. Load \n"
                          + "3. Withdraw\n"
                          + "Press 'q' to quit";
        System.out.println(processes);
        System.out.println("**********************************");
        
        
        while(true){
            System.out.print("Choose Process : ");
            String processes2 = sc.nextLine();
            if (processes2.equals("q")){
                break;    
            }
            else if (processes2.equals("1")){
                System.out.println("Balance : " + account.getBalance());
            }
            else if (processes2.equals("2")){                
                System.out.print("How Much You Want to load : ");
                int value = sc.nextInt();
                sc.nextLine();
                account.load(value);                
            }
            else if (processes2.equals("3")) {               
                System.out.print("How Much You Want to Withdraw : ");
                int value = sc.nextInt();
                sc.nextLine();
                account.withdraw(value);
            }
            else {
                
                System.out.println("Unvalid Process...");   
            }   
        }    
    }
}
