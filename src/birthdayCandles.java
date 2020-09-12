/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-09-2020
 *   Time: 02:11
 *   File: birthdayCandles.java
 */

import java.util.Scanner;

public class birthdayCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = in.nextInt();
        int[] candles = new int[n];
        int max = 0;
        System.out.println("enter array elements");
        for (int index = 0; index < n; index++) {
            candles[index] = in.nextInt();
            if (candles[index] > max) {
                max = candles[index];
            }

        }
        for (int height_i = 0; height_i < n; height_i++) {
            System.out.println(candles[height_i]);

        }
        System.out.println("the largest:" + max);

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (max == candles[i])
                total++;
        }
        System.out.println(total);
    }


}

