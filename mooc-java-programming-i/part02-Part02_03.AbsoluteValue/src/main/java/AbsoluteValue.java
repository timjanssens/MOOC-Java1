
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int output = number;
        
        if (number < 0) {
            output = number * -1;
        }
        
        System.out.println(output);
        
    }
}
