package pl.javastart.task;

public class App {
    public static void main(String[] args) {
        //int[] array = new int[]{1, 1, 2, 3, 4, 5, 6, 1};
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[]{5, 4, 3, 2, 1};
        int[] array2 = new int[100];
        int[] array3 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        for (int i = 0; i < array2.length; i++) {
            array3[i] = 100 - i;
        }
        BubbleSort sort = new BubbleSort();
        int[] sortedArray = sort.sortArray(array);
        int[] sortedArray1 = sort.sortArray(array1);
        int[] sortedArray2 = sort.sortArray(array2);
        int[] sortedArray3 = sort.sortArray(array3);

    }
}
