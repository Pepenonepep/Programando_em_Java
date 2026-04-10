/*
🇺🇸 English

The oldest known cipher is the Cipher of Caesar. Caesar wrote his letters by exchanging each letter for the next in the alphabet, to avoid that, when the letter was intercepted, enemy could read it. Over time, encryption has acquired better quality, but encryption based on substitution is still an interesting child's play, for example:

ZEN I T
POLAR

In this child's play, when writing a letter, the letter Z is replaced by the letter P and vice versa, as well as: E by O and so on. The phrase coded as follows: "Osro roxre osri caftide" can be deciphered as: "Este texto esta cifrado". As the game got serious, you were prompted for a program that decrypts encrypted messages from a supplied key.

Input
The input contains several test cases. Each test case begins with a line indicating two integers C and N, 0 < C < 21 and 0 < N < 100. C is the size of the cipher. On the next two lines is the C-sized cipher indicating which characters from the first line will be replaced by characters from the second line, a character appears only once, on the first or second line.

The cipher can contain letters from 'A' to 'Z', numbers from '0' to '9' plus white space and some punctuation symbols: '.' ',' ';' ':' '(' ')' '!' and '?'. In the next N lines are sentences and sentences encrypted by the cipher provided, which you must decipher. Each line contains a minimum of 1 and a maximum of 1000 characters. Any printable ASCII (non-extended) characters are allowed, in this case no accented characters are present, not even 'ç'.

Output
For each input test case your program must generate for each sentence line at the input a sentence line with the deciphered output, respecting the capitalization of the letter (capital letters are deciphered as case-sensitive when it is possible to apply, If it is not possible then it will be deciphered as lowercase letters). After each test case, a blank line should be printed, including after the last one.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

A cifra mais antiga conhecida é a Cifra de César. César escrevia suas cartas trocando cada letra pela próxima do alfabeto, para evitar que, quando a carta fosse interceptada, conseguissem ler. Com o tempo, a criptografia adquiriu melhor qualidade, mas a criptografia por substituição ainda é uma brincadeira de criança interessante, por exemplo:

ZEN I T
POLAR

Neste tipo de brincadeira, ao escrever uma carta a letra Z é trocada pela letra P e vice versa, bem como: E e O e assim sucessivamente. A frase cifrada desta forma: "Osro roxre osri caftide" pode ser decifrada como: "Este texto esta cifrado". Como a brincadeira ficou séria, a você foi solicitado um programa que decifre as mensagens cifradas a partir de uma chave fornecida.

Entrada
A entrada contém vários casos de teste. Cada caso de teste começa com uma linha indicando dois números inteiros C e N, 0 < C < 21 e 0 < N < 100. C é o tamanho da cifra. Nas duas linhas seguintes está a cifra de tamanho C indicando quais caracteres da primeira linha será substituído por caracteres da segunda linha, um caracter aparece uma única vez, na primeira ou na segunda linha.

A cifra pode conter letras de ‘A’ a ‘Z’, números de ‘0’ a ‘9’ além do espaço em branco e alguns símbolos de pontuação: '.' ',' ';' ':' '(' ')' '!' e '?'. Nas próximas N linhas estão frases e sentenças criptografadas pela cifra fornecida, que você deve decifrar. Cada linha contém no mínimo 1 e no máximo 1000 caracteres. São permitidos quaisquer caracteres ASCII (não extendido) imprimíveis, neste caso não estão presentes nenhum caracter acentuado, nem mesmo 'ç'.

Saída
Para cada caso de teste da entrada seu programa deve gerar para cada linha de frase e sentença de entrada, uma linha com a saída decifrada, respeitando a capitalização da letra (letras maiúsculas são decifradas como maiúsculas e minúsculas como minúsculas quando for possível aplicar a diferenciação, se não for possível serão decifrados como letras minúsculas). Após cada caso de teste deve ser impressa uma linha em branco, inclusive após o último.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;

public class Problem_2502_Deciphering_the_Encrypted_card{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        while(sc.hasNextInt()){
            int c=sc.nextInt();
            if(c<0 || c>21){
                continue;
            }
            int n=sc.nextInt();
            if(n<0 || n>100){
                continue;
            }
            sc.nextLine();
           String uncriptyCifra = sc.nextLine();
           String criptyCifra = sc.nextLine();
           int tamanhoUncriptyCifra = uncriptyCifra.length();
           int tamanhoCriptyCifra = criptyCifra .length();
           if(tamanhoUncriptyCifra>c || tamanhoUncriptyCifra< 1 || tamanhoCriptyCifra>c || tamanhoCriptyCifra<1){
               continue;
           }
           String possibilidadeValida = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,;:' '!?";
           for(int p=0;p<c;p++){
            String letra = criptyCifra.substring(p,p+1);
            String letra2 = uncriptyCifra.substring(p,p+1);
                if(!possibilidadeValida.contains(letra) || !possibilidadeValida.contains(letra2)){
                    continue;
            }

           }
           for(int o=0;o<n;o++){
            StringBuilder st = new StringBuilder();
           String frase = sc.nextLine();
           for(int p=0;p<frase.length();p++){
             String letraFrase = frase.substring(p,p+1);
             String letraSubstituta = letraFrase;

            for(int i=0;i<c;i++){
                String letra = criptyCifra.substring(i,i+1);
                String letra2 = uncriptyCifra.substring(i,i+1);
                if(letraFrase.equalsIgnoreCase(letra)){
                    
                            letraSubstituta = letra2;
                        
                            if (letraFrase.equals(letraFrase.toLowerCase())) {
                                letraSubstituta = letraSubstituta.toLowerCase();
                            }
                            else{
                                 letraSubstituta = letraSubstituta.toUpperCase();
                            }
                            break;
                    
                }
               else if (letraFrase.equalsIgnoreCase(letra2)) {
                            letraSubstituta = letra;
                            
                            if (letraFrase.equals(letraFrase.toLowerCase())) letraSubstituta = letraSubstituta.toLowerCase();
                            else letraSubstituta = letraSubstituta.toUpperCase();
                            break; 
                        }
            }
            st.append(letraSubstituta);
           }     
           System.out.println(st.toString());      
          
        }
        System.out.println();
        } // fim do while
        
        
        sc.close();
    }
}