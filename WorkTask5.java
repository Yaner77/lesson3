package lesson3;
import java.util.Arrays;
public class WorkTask5 {
    public static void main(String[] args) {
        int[] newData = getNewData(17,605);
        System.out.println(Arrays.toString(newData));
    }
    private static int[] getNewData(int len, int initialValue) {
        int [] data = new int [len];
        Arrays.fill(data,initialValue);
        return data;}}
