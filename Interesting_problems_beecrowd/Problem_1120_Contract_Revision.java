/*
🇺🇸 English

For years, all contracts of the Association of Contracts for Modernization (ACM) were typed using an old typewriter machine.

Recently Mr. Miranda, one of the accountants of the ACM, realized that the machine had a failure in one, and only one, numerical digit. More specifically, the flawed digit, when typed, is not printed on the sheet, as if the corresponding key was not pressed. He realized that this could have changed the numerical representation of contract values. Worried about accounting, Mr. Miranda wants to know, from the original values agreed for the contracts (which he kept in handwritten notes) which values are actually represented in the contracts. For example, if the failed digit in the machine is 5, an agreed value of 1500 would be represented in the corresponding contract as 100, because the digit 5 would not be printed. Note that Mr. Miranda wants to know the numeric value represented in the contract, ie, in the same machine, the number 5000 corresponds to the numeric value 0, not 000 (as it actually appears in the contract).

Input
The input consists of several test cases, each in one line. Each line contains two integersD and N (1 ≤ D ≤ 9, 1 ≤ N < 10100 ), representing, respectively, the digit that has failed in the machine and the number that was originally agreed for the contract (which can be very large because of hiperinflation).

The last test case is followed by a line which contains only two zeros separated by white space.

Output
For each test case in the input your program must print one line containing a single integer, the numeric value represented in the contract.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Durante anos, todos os contratos da Associação de Contratos da Modernolândia (ACM) foram datilografados em uma velha máquina de datilografia.

Recentemente Sr. Miranda, um dos contadores da ACM, percebeu que a máquina apresentava falha em um, e apenas um, dos dígitos numéricos. Mais especificamente, o dígito falho, quando datilografado, não é impresso na folha, como se a tecla correspondente não tivesse sido pressionada. Ele percebeu que isso poderia ter alterado os valores numéricos representados nos contratos e, preocupado com a contabilidade, quer saber, a partir dos valores originais negociados nos contratos, que ele mantinha em anotações manuscritas, quais os valores de fato representados nos contratos. Por exemplo, se a máquina apresenta falha no dígito 5, o valor 1500 seria datilografado no contrato como 100, pois o 5 não seria impresso. Note que o Sr. Miranda quer saber o valor numérico representado no contrato, ou seja, nessa mesma máquina, o número 5000 corresponde ao valor numérico 0, e não 000 (como ele de fato aparece impresso).

Entrada
A entrada consiste de diversos casos de teste, cada um em uma linha. Cada linha contém dois inteiros D e N (1 ≤ D ≤ 9, 1 ≤ N < 10100 ), representando, respectivamente, o dígito que está apresentando problema na máquina e o número que foi negociado originalmente no contrato (que podem ser grande, pois Modernolândia tem sido acometida por hiperinflação nas últimas décadas).

O ultimo caso de teste é seguido por uma linha que contém apenas dois zeros separados por espaços em branco.

Saída
Para cada caso de teste da entrada o seu programa deve imprimir uma linha contendo um único inteiro V, o valor numérico representado de fato no contrato.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;
import java.math.*;

public class Problem_1120_Contract_Revision {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        String N = sc.next();
        while (D != 0 && !N.equals("0")) {
            if (D >= 1 && D <= 9 && N.length() >= 1 && N.length() < Math.pow(10, 100)) {
                String letraD = String.valueOf(D);

                N = N.replace(letraD, "");
                N = N.trim();
                if(N.isEmpty()){
                    System.out.println("0");
                }
                else{
                    BigInteger numerolimpo = new BigInteger(N);
                    System.out.println(numerolimpo);
                }

            }
            D = sc.nextInt();
            N = sc.next();
        }
        sc.close();
    }
}
