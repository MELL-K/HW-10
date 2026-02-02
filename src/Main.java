//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] inputArray1 = {27000, 35000, 40000, 29000, 42000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i : inputArray1) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double middle = (double) sum / inputArray1.length;
        double[] outputArray1 = {sum, max, min, middle};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Задача 2");
        int[] inputArray2 = {27000, 35000, 40000, 29000, 42000};
        double[] outputArray2 = new double[inputArray2.length];
        int index = 0;
        for (double pay : inputArray2) {
            double tax = pay * 0.13;
            outputArray2[index] = tax;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println();


        System.out.println("Задача 3");
        int[] inPutArray3 = {4000, 3500, 4500, 7500, 5500};
        boolean[] outPutArray3 = new boolean[inPutArray3.length];
        int maxbonus = 5000;
        int b = 0;
        for (int i : inPutArray3) {
            outPutArray3[b] = i > maxbonus;
            b++;
        }
        System.out.println(Arrays.toString(inPutArray3));
        System.out.println(Arrays.toString(outPutArray3));
        System.out.println();

        System.out.println("Задача 4");
        int[] inputArray4 = {100, -200, 300, 400, -500};
        boolean[] outputArray4 = {true};
        for (int i : inputArray4) {
            if (i < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println();

        System.out.println("Задача 5");
        int[] inputArray5 = {15000, 2000, -1000, 12000, 10000};
        int[] outputArray5 = {0};
        for (int value : inputArray5) {
            if (value > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
        System.out.println();
    }
}
