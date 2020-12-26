
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";
        
        System.out.print("Enter username: ");
        String guesName = scanner.nextLine();
        System.out.print("Enter: password: ");
        String guesPassword = scanner.nextLine();
        
        if (guesName.contains(username1) && guesPassword.contains(password1) ||
                guesName.contains(username2) && guesPassword.contains(password2)) {
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }
        
        
        
        
        
        
    }
}
