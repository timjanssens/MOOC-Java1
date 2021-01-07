
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
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

    public static int indexOfSmallest(int[] array) {
        int indexSmallest = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexSmallest = 0;
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;      
        
    }
    
    public static void sort(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
        System.out.println(array.toString());
}

}
