package lesson3;

public class WorkTask6 {
    public static void main(String[] args) {data();}
    private static void data() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];}}
        System.out.println("MIN=" + min);
        System.out.println("MAX=" + max);}}

