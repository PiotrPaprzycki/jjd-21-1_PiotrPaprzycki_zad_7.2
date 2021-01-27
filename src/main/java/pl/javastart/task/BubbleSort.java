package pl.javastart.task;

public class BubbleSort {


    int[] sortArray(int[] array) {
        int swapNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    swapNumber += 1;
                }
            }
        }
        System.out.println("Swap number is: " + swapNumber);
        return array;
    }
}


