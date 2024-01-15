package edu.training.jc8.main;

import java.util.Random;
public class Main07 {


//    Дан двухмерный массив 5×5.
//    Найти сумму модулей отрицательных
//    нечетных элементов.

    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        initArray(arr);

        showArray(arr);

        addNegativeElements(arr);

    }


    public static int[][] initArray(int[][] a) {

        Random rand = new Random ();

        for ( int i = 0;i<a.length;i++){
            for (int j = 0; j< a[i].length;j++) {
                a[i][j] = -rand.nextInt(100);
            }
        }
        return a;
    }

    public static void showArray(int[][] array1) {
        for ( int i = 0;i< array1.length; i++) {
            for (int j = 0;j< array1[i].length;j++){
                System.out.printf("[%4d]", array1[i][j]);

            }
            System.out.println();
        }


    }
    public static void addNegativeElements (int[][] array1) {
        int sum = 0;
         for (int i = 0; i < array1.length; i++) {
             for ( int j = 0; j < array1[i].length; j++) {
                 if ( array1[i][j] <=0 && (array1[i][j] % 2 != 0)){
                     sum+=Math.abs(array1[1][j]);

                 }
             }
         }
        System.out.println("сумма модулей отрицательных нечетных элементов: " + sum);


    }
}