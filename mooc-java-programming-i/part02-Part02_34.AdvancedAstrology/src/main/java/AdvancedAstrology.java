
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        for (int line = 0; line < size; line++) {
            for (int space = (size - 1); space > line; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        for (int line = 1; line <= height; line++) {
            for (int space = (height - 1); space >= line; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (line * 2) - 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int line = 0; line <= 1; line++) {
            for (int space = 0; space < height - 2; space++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 3; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
