package lesson3;
import java.util.Arrays;
public class WorkTask1 {
    public static void main(String[] args) {
        int[] data = {0, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                data[i] = 0;
            } else {
                data[i] = 1;}}
        System.out.println(Arrays.toString(data));}}
