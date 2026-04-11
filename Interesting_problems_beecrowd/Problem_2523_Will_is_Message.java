/*
🇺🇸 English

After an intense match of a RPG game at the house of one of his friends, young Will disappeared mysteriously! Everyone is desperately looking for him everywhere. Meanwhile, strange things are happening at your home. One of these things, however, allows you to communicate with the boy!

There are exactly 26 bulbs attached to the wall of your living room, numbered from 1 to 26 from left to right. Also, there is a letter drawn in the wall bellow each bulb. When Will wants to send you a message, he will (mysteriously) blink the bulbs corresponding to each letter of his message, one at a time. For example, if he wants to send you the message HELP, he will blink, in this order, the bulbs above the letters H, E, L and P.

Given the letter associated to each bulb and the order of the bulbs Will blinked, decipher the message he sent!

Input
The input contains several test cases. The first line of each test case contains a string with exactly 26 uppercase letters, containing all letters of the English alphabet. The first letter in the string is associated to bulb 1; the second letter in the string is associated to bulb 2; and so on. The next line contains an integer N (1 ≤ N ≤ 104), the number of bulbs that were blinked. The third line contains N integers li (1 ≤ li ≤ 26), indicating the bulbs that were blinked, in that order.

The input ends with end-of-file (EOF).

Output
For each test case, print a single line containing the message sent by Will.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Ao voltar de um intenso jogo de RPG na casa de um amigo, o jovem Will desapareceu misteriosamente! Todos estão desesperadamente procurando por ele por todos os cantos. Enquanto isso, coisas estranhas estão acontecendo em sua casa. Uma delas, entretanto, lhe permite comunicar-se com o garoto!

Há exatamente 26 lâmpadas penduradas na parede da sua sala, numeradas de 1 a 26 da esquerda para a direita. Além disso, há uma letra do alfabeto pintada na parede em baixo de cada lâmpada. Quando Will quer lhe enviar uma mensagem, ele irá (misteriosamente) piscar, uma a uma, as lâmpadas correspondentes a cada letra de sua mensagem. Por exemplo, se ele quer enviar a mensagem HELP, ele irá piscar, nesta ordem, as lâmpadas acima das letras H, E, L e P.

Dada a letra associada a cada lâmpada e a ordem das lâmpadas que foram piscadas por Will, decifre a mensagem que ele enviou!

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém uma string de exatamente 26 letras maiúsculas contendo todas as letras do alfabeto inglês. A primeira letra da string está associada à lâmpada 1; a segunda letra está associada à lâmpada 2; e assim por diante. A próxima linha contém um inteiro N (1 ≤ N ≤ 104), o número de lâmpadas que foram piscadas. A terceira linha contém N inteiros li (1 ≤ li ≤ 26), indicando as lâmpadas que foram piscadas, em ordem.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha contendo a mensagem enviada por Will.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;


public class Problem_2523_Will_is_Message {
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        StringBuilder st = new StringBuilder();
        String alfabeto = sc.next().toUpperCase();
        if(alfabeto.length()<1 || alfabeto.length()>26){
            continue;
        }
       if(!alfabeto.matches("[A-Z]+")){
        continue;
       }
        
        int n=sc.nextInt();
        for(int p=0;p<n;p++){
            int posicaoDaLetraEscolhida= sc.nextInt();
            char letraEscolhida = alfabeto.charAt(posicaoDaLetraEscolhida-1);
            st.append(letraEscolhida);
        }
        st.append("\n");
        System.out.print(st.toString());
    }
        sc.close();
    }
}
