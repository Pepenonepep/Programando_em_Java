/*
🇺🇸 English

6+9=15 seems okay. But how come 4+6=2?

Look at, Mofiz worked hard throughout his Digital Logic course, but when he was asked to implement a 32 bit adder for the laboratory exam, he did some mistake in the design part. After scavenging the design for half an hour, he found his flaw!! He was doing bitwise addition but his carry bit always had zero output. Thus,


4  = 00000000 00000000 00000000 00000100
+6 = 00000000 00000000 00000000 00000110
----------------------------------------
2  = 00000000 00000000 00000000 00000010

It’s a good thing that he finally found his mistake, but it was too late. Considering his effort throughout the course, the instructor gave him one more chance. Mofiz had to write an efficient program that would take 2 unsigned 32 bit decimal numbers as input, and produce an unsigned 32 bit decimal number as the output adding in the same way as his circuit does.

Input
In each input line there will be a pair of integer separated by a single space. Input ends at EOF.

Output
For each input line, the program must provide an output's line: the value after adding the two numbers in the "Mofiz way".

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

6+9=15 parece ok. Mas como pode estar certo 4+6=2?

Veja só. Mofiz trabalhou duro durante seu curso de Eletrônica Digital, mas quando lhe foi solicitado que implementasse um somador de 32 bits como exame no laboratório, ele acabou fazendo algum erro na parte de projeto. Depois de vasculhar seu projeto por uma hora e meia, ele encontrou seu erro. Ele estava fazendo soma de bits, mas seu carregador de bit (carry) sempre apresentava como saída o valor zero. Portanto,

4  = 00000000 00000000 00000000 00000100
+6 = 00000000 00000000 00000000 00000110
----------------------------------------
2  = 00000000 00000000 00000000 00000010


Claro que já é uma boa coisa ele finalmente ter encontrado o seu erro, mas isso foi muito tarde. Considerando seu esforço durante o curso, o instrutor deu a ele mais uma chance: Mofiz teria que escrever um programa eficiente que pegaria 2 valores decimais de 32 bits sem sinal como entrada e deveria produzir um número de 32 bits sem sinal como saída, ou seja, somando do mesmo modo como o circuito faz.

Entrada
Em cada linha de entrada haverá um par de inteiros separado por um único espaço. A entrada termina com EOF.

Saída
Para cada linha de entrada, o programa deverá fornecer uma linha de saída, que é o valor após somar dois números no modo “Mofiz”.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_1026_To_Carry_or_not_to_Carry{
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
       
        while(sc.hasNextLong()){
            long a = sc.nextLong();
            long b= sc.nextLong();
            long resultado = a^b;
            System.out.println(resultado);
        }

        sc.close();
    }

}