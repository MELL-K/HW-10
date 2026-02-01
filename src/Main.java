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
        }
        for (int i : inputArray1) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : inputArray1) {
            if (min > i) {
                min = i;
            }
        }
        float middle = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, middle};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));


        System.out.println("Задача 2");
        int[] inputArray2 = {27000, 35000, 40000, 29000, 42000};
        int index = 0;
        float[] outputArray2 = new float[5];
        for (float pay : inputArray2) {
            float tax = pay * 0.13f;
            outputArray2[index] = tax;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("Задача 3");
        int[] inPutArray3 = {4000, 3500, 4500, 7500, 5500};
        boolean[] outPutArray3 = new boolean[5];
        for (int b = 0; b < inPutArray3.length; b++) {
            if (inPutArray3[b] > 5000) {
                outPutArray3[b] = true;
            } else {
                outPutArray3[b] = false;
            }
            System.out.println(inPutArray3[b]);
            System.out.println(outPutArray3[b]);
        }


        System.out.println("Задача 4");
        int[] inputArray4 = {100, -200, 300, 400, -500};
        boolean outputFlag = true;
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {
                outputFlag = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputFlag);

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
    }
}
