package pl.javastart.task;

public class App {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 3, 4, 5, 6, 1};
        BubbleSort sort = new BubbleSort();
        int[] sortedArray = sort.sortArray(array);
        for (int i : sortedArray) {
            System.out.println(i);
        }
    }
}
