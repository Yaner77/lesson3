package lesson3;

import java.util.Arrays;

public class TestArrays {
    static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        testOneArray();
        testTwoArray();
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
        data[0] = 1;
        data[3] = 10;
        data[data.length - 1] = 10;
        /*for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }*/
        Arrays.sort(data);
        //System.out.println(Arrays.toString(data));
        System.out.println(convertArrayToString(data));
    }

    private static String convertArrayToString(int[] array) {


        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1) {
                str += ", ";
            }
        }

        str += "]";
        return str;

    }

    private static void testTwoArray() {
        int[][] deepData = new int[4][3];
        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;

            }

        }
        // System.out.println(Arrays.deepToString(deepData));
        for (int i = 0; i < deepData.length; i++) {
            // System.out.print(Arrays.toString(deepData[i]));
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%2d ", deepData[i][j]);}
            {System.out.println();
            }
            for (int[]deepDatum:deepData) {
                for (int num : deepDatum) {
                    System.out.printf("%2d ", num);

                }
                System.out.println();
            }

        }
    }
}
