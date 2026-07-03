/*
🇺🇸 English

João and Enzo love encrypt their messages. To do this encrypt, they use the Vigènere cipher. This technique is really similar to the Cesar cipher, however its use a specific key for each letter in a word to be encrypted. The below table shows the ciphering pattern, that consists of the repetition of the alphabet 26 times, one time per row of this table, and in each row, the letters are displaced one space left. This 26 rows correspond to the 26 Cesar ciphers.



A random word is chosen as the keyword and each letter of this word indicates a line of the table to use to cipher or decipher the encrypted message. For example:

The text to be ciphered is "computer science";
The key-word is "obi";
Now, we should repeat the keyword many times as necessary to compose all the text to be ciphered:
computer science
obiobiob obiobio
To do the encryption of the first letter, we should find the line of the letter "o" in the table, and look for the column of the first letter of the text to encrypt, "c". To the second letter, we should find the line of the letter "b" on the column "i", and so on, up to we find as result:
qpudvbss aqjmbdm
Once that do the encryption of all words in a message is a hard work, João and Enzo chosen to encrypt only words that initiate with a consonant letter. For this reason, they just apply the keyword on the words that they want to encrypt.

Given a keyword and a text message, your task is to encrypt this message with Vigènere cipher according to the João and Enzo added rule.

Input
The first line of the input consists of a keyword K (3 ≤ K ≤ 45), that represents the key to the cipher. This word is just composed by the alphabet (a-z) in lowercase, without spaces. The next line contains an integer N (1 ≤ N ≤ 150) that indicates how many messages we need to encrypt. The next N lines are the messages. These messages do not pass 105 characters and they are composed by the alphabet (a-z) in lowercase and by spaces.

Output
The output should display the encrypted message according to the friends rule.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

João e Enzo adoram criptografar as suas mensagens. Para essa criptografia, eles utilizam a técnica da cifra de Vigenère. Essa técnica é bastante semelhante a cifra de Cesar, porém utiliza de diversas "chaves" para cada letra da frase a ser criptografada. A tabela abaixo demonstra o padrão da cifra, consistindo na repetição do alfabeto 26 vezes, onde em cada linha uma letra é deslocada para a esquerda em relação a linha anterior. Essas 26 linhas correspondem às 26 possíveis cifras de César.



Uma palavra aleatória é escolhida como palavra-chave, e cada letra desta palavra vai indicar a linha a ser utilizada para cifrar ou decifrar uma letra da mensagem. Por exemplo:

O texto a ser criptografado é "ciencia da computacao";
Definimos como palavra-chave "obi";
Agora, devemos repetir a palavra-chave tantas vezes forem necessárias até obtermos o comprimento do texto a ser criptografado:
ciencia da computacao
obiobio bi obiobiobio
Para realizar a criptografia da primeira letra, devemos encontrar a linha da letra "o" na tabela, e procurar pela coluna da primeira letra da palavra, "c". Para a segunda letra, devemos procurar pela linha "b" coluna "i", e assim por diante, até termos como resultado:
qjmbdqo ei qpudvbodic
Uma vez que realizar a cifragem de todas as palavras das mensagens a serem enviadas é um trabalho bastante custoso, os amigos decidiram que somente irão criptografar as palavras que iniciarem com uma letra consoante. Sendo assim, eles somente aplicarão a palavra-chave nas palavras que eles irão de fato criptografar.

Dada uma palavra-chave e um texto de uma mensagem, sua tarefa é criptografar esta mensagem utilizando a cifra de Vigenère mas não esquecendo da regra adicionada por João e Enzo.

Entrada
A primeira linha contém uma palavra-chave K (3 ≤ K ≤ 45), que representa a chave para a criptografia. Ela somente é formada pelo alfabeto (a-z) em letras minúsculas, sem espaços. A linha a seguir contém um inteiro N (1 ≤ N ≤ 150) que indica a quantidade de mensagens a serem criptografadas. As próximas N linhas correspondem as mensagens. Estas mensagens não ultrapassam 105 caracteres e são compostas pelo alfabeto (a-z) em letras minúsculas e por espaços.

Saída
A saída deve apresentar a mensagem criptografada, de acordo com a regra dos amigos.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2852_Messaging {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String chave = sc.next();
        int n = sc.nextInt();
        sc.nextLine();

        int tamChave = chave.length();

        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            String[] palavras = linha.split(" ");
            StringBuilder resultado = new StringBuilder();

            int k = 0;

            for (int p = 0; p < palavras.length; p++) {
                String palavra = palavras[p];

                if (palavra.length() > 0) {
                    char primeiraLetra = palavra.charAt(0);

                    if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o'
                            || primeiraLetra == 'u') {
                        resultado.append(palavra);
                    } else {
                        for (int j = 0; j < palavra.length(); j++) {
                            char letraTexto = palavra.charAt(j);
                            char letraChave = chave.charAt(k);

                            char letraCripto = (char) ('a' + (letraTexto - 'a' + (letraChave - 'a')) % 26);
                            resultado.append(letraCripto);

                            k = (k + 1) % tamChave;
                        }
                    }
                }

                if (p < palavras.length - 1) {
                    resultado.append(" ");
                }
            }

            System.out.println(resultado.toString());
        }

        sc.close();
    }
}
