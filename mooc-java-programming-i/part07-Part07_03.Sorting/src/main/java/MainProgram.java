
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] numbers) {
        int smallest = numbers[0];
        for (int number : numbers) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

}
