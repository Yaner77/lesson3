package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testRandom();
        testConsoleInput();
    }

    private static void testConsoleInput() {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        //TestMethods.multiplyAndPrint(a,b);
    }

    private static void testRandom() {
        int[]data=new int [50];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i]= random.nextInt(10);
            data[i]= random.nextInt(8)+3;
            data[i]= random.nextInt(13)-5;
            data[i]= random.nextInt(3, 11);
            data[i]=(int)(Math.random()*10);
            data[i]=(int)(Math.random()*8)+3;
            data[i]=(int)(Math.random()*13)-5;
        }
        System.out.println(Arrays.toString(data));
    }



}

