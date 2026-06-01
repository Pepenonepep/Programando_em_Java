/*
🇺🇸 English

Giovanna loves Christmas. The parties, the family, Christmas decorations and especially the famous blink Christmas lights. But this year little Gio was sad to realize that his set of lights is broken. Some lights still work, others do not. Giovanna obviously wants to fix her preferred object but does not have enough bulbs to replace all the burned bulbs so she decided to do the following: divide the Christmas lights into ordered groups of 50 bulbs and in each group only fix the largest number of consecutive burned bulbs.

Because of the many groups, the task became tedious and to try to remedy this, Giovanna, noting the similarity of groups with binary representation of numbers when she imagined burned lights bulbs like 1's and functional bulbs like 0's, decided to think of them effectively as numbers and wrote the representations decimals of these binaries then tried to figure out the amount of bulbs to be exchanged from these annotations.

Your task is, given Gio's notes, find out how many bulbs will be changed in each group.

Input
The first line of the entry contains an integer N (1 ≤ N ≤ 103) representing the number of groups Giovanna wrote down. The next N rows contain an integer X each representing the decimal equivalent of the number representing the group.

Output
The output consists of N lines each containing the size of the largest sequence of consecutive bulbs burned in each group, respecting the order of entry of the groups.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 



/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2718_Christmas_Lights {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long numero = sc.nextLong();
            String binario = Long.toBinaryString(numero);
            int maiorSequencia = 0;
            int sequencia = 0;
            for (int j = 0; j < binario.length(); j++) {
                char posicao = binario.charAt(j);
                if (posicao == '1') {
                    sequencia++;

                    if (maiorSequencia < sequencia) {
                        maiorSequencia = sequencia;
                    }
                } else {
                    sequencia = 0;
                }
            }
            st.append(maiorSequencia + "\n");
        }
        System.out.print(st.toString());
        sc.close();
    }
}