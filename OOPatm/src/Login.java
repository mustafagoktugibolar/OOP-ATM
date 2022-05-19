import java.util.Scanner;
public class Login {
    public boolean login_method (Account account){
        Scanner sc = new Scanner(System.in);
        String account_number;
        String password;        
        
        
        System.out.print("Account Number : ");
        account_number = sc.nextLine();
        System.out.print("Password : ");
        password = sc.nextLine();
        
        
        if(account.getAccount_number().equals(account_number) && account.getPassword().equals(password)){
            return true;
        }
        else{
            return false;                
        }
    }   
}
    

