package lesson3;
import java.util.Arrays;
public class WorkTask3 {
    public static void main(String[] args) {
        int [] data = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            int a = data [i];
            if (a<6) {
                data [i] = a*2;}}
        System.out.println(Arrays.toString(data));}}
