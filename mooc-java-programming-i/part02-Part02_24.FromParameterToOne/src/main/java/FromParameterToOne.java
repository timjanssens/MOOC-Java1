
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int times) {

        while (times > 0) {
            System.out.println(times--);
        }
    }
}
