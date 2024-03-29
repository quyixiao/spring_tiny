package com.t2022.t01.t14;

public class TwoDimensionalArraySum {


    private static final int RUNS = 100;

    private static final int DIMENSION_1 = 1024 * 1024;

    private static final int DIMENSION_2 = 6;

    private static long[][] longs;


    public static void main(String[] args) {
        // 初始化数据
        longs = new long[DIMENSION_1][];
        for (int i = 0; i < DIMENSION_1; i++) {
            longs[i] = new long[DIMENSION_2];
            for (int j = 0; j < DIMENSION_2; j++) {
                longs[i][j] = 1l;
            }
        }
        System.out.println("Array初始化完成 ");
        long sum = 0;
        long start = System.currentTimeMillis();
        for (int r = 0; r < RUNS; r++) {
            for (int i = 0; i < DIMENSION_1; i++) {
                for (int j = 0; j < DIMENSION_2; j++) {
                    sum += longs[i][j];
                }
            }
        }


        System.out.println("spend time1 :" + (System.currentTimeMillis() - start));

        System.out.println("sum1 :" + sum);

        sum = 0l;
        start = System.currentTimeMillis();
        for (int r = 0; r < RUNS; r++) {
            for (int j = 0; j < DIMENSION_2; j++) { // 6
                for (int i = 0; i < DIMENSION_1; i++) { // 1024 * 1024
                    sum += longs[i][j];
                }
            }
        }
        System.out.println("spend time2 :" + (System.currentTimeMillis() - start));
        System.out.println("sum2 :" + sum);
    }


}
