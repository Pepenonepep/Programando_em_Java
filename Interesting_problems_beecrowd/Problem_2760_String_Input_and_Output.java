
/*
🇺🇸 English

Your teacher would like to make a program with the following characteristics:

Create 3 variables to store a phrase of up to 100 characters;
Read a sentence for the first variable;
Read a sentence for the second variable;
Read a sentence for the third variable;
Print the first variable read in step 2, the second variable read in step 3, the third variable read in step 4. Be sure to skip line;
Print the first variable read in step 3, the second variable read in step 4, the third variable read in step 2. Be sure to skip line;
Print the first variable you read in step 4, the second variable you read in step 2, the third variable you read in step 3. Be sure to skip line;
Repeat procedure 5, printing only 10 characters of each variable.
Input
The input consists of several test files. Each test file has three rows. In the first line has a variable A that stores a phrase of up to 100 characters. In the second line has a variable B that stores a phrase of up to 100 characters. In the third line has a variable C that stores a phrase of up to 100 characters. As shown in the following input example.

Output
For each file in the input, you have an output file. The output file has four rows as described in items 5, 6, 7, and 8. As shown in the following output example.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

O seu professor gostaria de fazer um programa com as seguintes características:

Crie 3 variáveis para armazenar uma frase de no máximo 100 caracteres;
Leia uma frase para a primeira variável;
Leia uma frase para a segunda variável;
Leia uma frase para a terceira variável;
Imprima a primeira variável lida no passo 2, a segunda variável lida no passo 3, a terceira variável lida no passo 4. Não esqueça de pular linha;
Imprima a primeira variável lida no passo 3, a segunda variável lida no passo 4, a terceira variável lida no passo 2. Não esqueça de pular linha;
Imprima a primeira variável lida no passo 4, a segunda variável lida no passo 2, a terceira variável lida no passo 3. Não esqueça de pular linha;
Repita o procedimento 5, imprimindo só 10 caracteres de cada variável.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. Na primeira linha tem uma variável A que armazena uma frase de no máximo 100 caracteres. Na segunda linha tem uma variável B que armazena uma frase de no máximo 100 caracteres. Na terceira linha tem uma variável C que armazena uma frase de no máximo 100 caracteres. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas da forma descrita nos itens 5, 6, 7 e 8. Conforme mostra o exemplo de saída a seguir.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2760_String_Input_and_Output {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            System.out.println(a + b + c);
            System.out.println(b + c + a);
            System.out.println(c + a + b);
            String aSub = a.substring(0, Math.min(a.length(), 10));
            String bSub = b.substring(0, Math.min(b.length(), 10));
            String cSub = c.substring(0, Math.min(c.length(), 10));

            System.out.println(aSub + bSub + cSub);
        }

        sc.close();
    }

}
