
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        //  System.out.println("");
        // implement here finding the indices of a number
        int indexOfGreatest = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(indexOfGreatest) <= list.get(i)) {
                indexOfGreatest = i;
            }
        }

        System.out.println("The greatest number: " + list.get(indexOfGreatest));
    }
}
