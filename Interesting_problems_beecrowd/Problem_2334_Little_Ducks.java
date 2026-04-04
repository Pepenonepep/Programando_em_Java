/*
🇺🇸 English

Five little ducks went for a walk. Beyond the mountains. To play. Their mom cried: 'Quack, quack, quack, quack'. But only four little ducks came back from there. Four little ducks went for a walk. Beyond the mountains. To play. Their mom cried: 'Quack, quack, quack, quack'. But only three little ducks came back from there. Three little ducks went for a walk. Beyond the mountains. To play. Their mom cried: 'Quack, quack, quack, quack'. But only two little ducks came back from there. Two little ducks went for a walk. Beyond the mountains. To play. Their mom cried: 'Quack, quack, quack, quack'. But only one little duck came back from there. One little duck went for a walk. Beyond the mountains. To play. Its mom cried: 'Quack, quack, quack, quack'. But no little ducks came back from there.

The mother duck was so sad that day decided to ask your help to look beyond the mountains, at the seashore, how many ducklings did not return from there.

Input
There will be several test cases, the first line of each test case contains an integer  (0 ≤ P ≤ 1019) representing the total amount of ducks, the input ends with P = -1.

Output
The output file should contain the amount of little ducks returned there.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Cinco patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só quatro patinhos voltaram de lá. Quatro patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só três patinhos voltaram de lá. Três patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só dois patinhos voltaram de lá. Dois patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só um patinho voltou de lá. Um patinho foi passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas nenhum patinho voltou de lá.

A mamãe patinha ficou tão triste naquele dia que resolveu pedir sua ajuda para procurar além das montanhas, na beira do mar, quantos patinhos não voltaram de lá.

Entrada
Haverá vários casos de testes, a primeira linha de cada caso de teste contém um inteiro (0 ≤ P ≤ 1019) representando a quantidade total de patos, a entrada termina com P = -1.

Saída
O arquivo de saída deve conter a quantidade de patinhos que retornaram.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;


public class Problem_2334_Little_Ducks{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder saida = new StringBuilder();
        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (linha.isEmpty()) continue;

            BigInteger patos = new BigInteger(linha);
            if (patos.equals(BigInteger.valueOf(-1))) {
                break;
            }

            if (patos.equals(BigInteger.ZERO)) {
                saida.append(BigInteger.ZERO).append('\n');
            } else {
                saida.append(patos.subtract(BigInteger.ONE)).append('\n');
            }
        }
        System.out.print(saida.toString());
    }
}
        
    
         