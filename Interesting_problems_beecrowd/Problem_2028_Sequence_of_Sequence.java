/*
Hyam is a guy that loves sequences. He is finding interesting sequences that even Fibonacci would not have imagined. One day Hyam saw that given a number N, he could make a sequence like 0 1 2 2 3 3 3 4 4 4 …N N N … N. However, Hyam saw that each value that increased in the sequence number, the total quantity increases at a factorial rate. In this case, instead of multiplying, you add the total number of numbers to the sequence with the value of the next number in the sequence. For example, if N = 2. The correct sequence would be 0 1 2 2, which is 4 digits. Now, if N = 3, the next number in the sequence would have the value 3, so the total quantity of numbers in the sequence would bem the quantiy of numbers with N = 2, which is 4, plus the value of the next number in the sequence, in this case 3, giving you 7, since the correct sequence for N = 3 is 0 1 2 2 3 3 3.

Your task is make an algorithm that given a integer N, has as answer the total quantity of numbers of this sequence and below the complete sequence.

Input
The input consists of several test cases. Each case is composed of an integer N (0 <= N <= 200) that indicates the last value of the last N numbers of the sequence numbers.
The input ends with end of file (EOF).

Output
The output is in format Case X: N numbers where X is the order of number of cases and N is the number of numbers that contains the complete sequence, the next line sequence numbers with a space between them. You are asked to leave a blank line after each case.

*/
package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

class constantes {
  public static final int T = 20500;
}

public class Problem_2028_Sequence_of_Sequence {
  public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[constantes.T];
    vetor[0] = 0;
    vetor[1] = 1;
    int casos = 1;
    while (sc.hasNext()) {
      int posicao = 2;
      int N = sc.nextInt();
      if (N < 0 || N > 200) {
        sc.close();
        return;
      } else {
        if (N == 0) {
          System.out.printf("Caso %d: 1 numero\n0\n", casos);
          casos++;
        } else if (N == 1) {
          System.out.printf("Caso %d: 2 numeros\n0 1\n", casos);
          casos++;
        } else {
          for (int i = 2; i <= N; i++) {
            int cont = 0;
            while (cont < i) {
              vetor[posicao] = i;
              cont++;
              posicao++;
            }
          }
          System.out.printf("Caso %d: %d numeros\n", casos, posicao);
          casos++;
          StringBuilder sb = new StringBuilder();
          for (int p = 0; p < posicao; p++) {
            if (p == posicao - 1) {
              sb.append(vetor[p]).append("\n");
            } else {
              sb.append(vetor[p]).append(" ");
            }
          }
          System.out.print(sb.toString());
        }

      }
      System.out.println();
    }
    sc.close();
  }

}