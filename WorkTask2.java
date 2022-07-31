package lesson3;
import java.util.Arrays;
public class WorkTask2 {
    public static void main(String[] args) {
        int [] data = new int[100];
        for (int i = 0; i < data.length ; i++) {
            data [i] = i + 1;}
        System.out.println(Arrays.toString(data));}}