
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        
        while(true){
            String word = scanner.nextLine();
            
            int number;
            
            if (word.equalsIgnoreCase("end")){
                break;
            } else {
                number = Integer.valueOf(word);
            }
            
            System.out.println(Math.round(Math.pow(number, 3)));
         
        }
        
  
    }
}
