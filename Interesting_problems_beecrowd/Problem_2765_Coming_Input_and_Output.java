/*
🇺🇸 English

Your teacher would like to make a program with the following characteristics:

Read a sentence that will have a comma in the middle of the text;
Print the first part of the sentence;
Print the second part of the sentence.
Input
The input consists of several test files. In each test file there is one line. The line has a phrase with a maximum of 100 characters (may have white space) and a comma. As shown in the following input example.

Output
For each file in the entry, you have an output file. The output file has two lines according to steps 2 and 3. As shown in the following output example.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

O seu professor gostaria de fazer um programa com as seguintes características:

Leia uma frase que vai ter uma virgula no meio do texto;
Imprima a primeira parte da frase;
Imprima a segunda parte da frase.
Entrada
A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma linha. A linha tem uma frase com no máximo 100 caracteres (pode ter espaço em branco) e uma virgula. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem duas linhas conforme os passos 2 e 3. Conforme mostra o exemplo de saída a seguir.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2765_Coming_Input_and_Output {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            StringBuilder st = new StringBuilder();
            String texto = sc.nextLine();
            for (int p = 0; p < texto.length(); p++) {
                char letra = texto.charAt(p);
                if (letra == ',') {
                    st.append("\n");
                    continue;
                }
                st.append(letra);
            }
            st.append("\n");
            System.out.print(st.toString());
        }
        sc.close();
    }
}