package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2846_Fibonot {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 2;
        int count = 0;

        while (true) {
            for (int i = a + 1; i < b; i++) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    sc.close();
                    return;
                }
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}