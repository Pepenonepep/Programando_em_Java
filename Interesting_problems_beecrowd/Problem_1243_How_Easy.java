/*
🇺🇸 English

TopCoder decided to automate the process of assigning levels of difficulty to the problems. TopCoder developers concluded that the difficulty of the problem is related only to average length of the words in the problem statement. If the average length of the words of the statement is less than or equal to 3, the problem difficulty receives 250 points. If the average length of the words of the statement is 4 or 5, the problem difficulty receives 500 points. If the average length of utterance of words is greater than or equal to 6, the problem difficulty receives 1000 points.


Definitions:

Symbol: A set of characters linked by spaces from both sides, or at the beginning of the description of the problem, or even the end of the description of the problem.

Word: a symbol that contains only letters a-z or A-Z, and can be finished with a single point.

Word length: number of letters in a word (a point is not a letter).


Examples of symbols are words (quotes just to exemplify): "AB", "ab".

Example of symbols that are not words: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".


The average length of the words is given by the sum of the sizes of the utterance of words divided by the number of words, the division is made by integers. If the word count is zero, then the average length of the words is zero.


Your task is given the problem statement, compute its classification of difficulty of the problem, which can be 250, 500, or 1000.

Input
The entry contains several test cases. Each test case is composed of a line containing the statement of a problem, is a string containing between 1 and 50 characters ('A'-'Z','a'-'z','0'-'9', ' ', '.') inclusive. The end of input is determined by EOF.

Output
Compute the average length of words in the statement of the problem, and show the classification of the problem, for more details see the example below.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

TopCoder decidiu automatizar o processo de atribuição de níveis de dificuldade para os problemas. Os desenvolvedores do TopCoder concluíram que a dificuldade do problema esta relacionado apenas ao comprimento médio das palavras do enunciado do problema. Se o comprimento médio das palavras do enunciado é menor ou igual a 3, o problema recebe dificuldade de 250 pontos. Se o comprimento médio das palavras do enunciado for 4 ou 5, o problema recebe dificuldade de 500 pontos. Se o comprimento médio das palavras do enunciado for maior ou igual a 6, o problema recebe dificuldade de 1000 pontos.


Definições:

Símbolo: um conjunto de carateres ligados em ambos os lados por espaços, ou pelo início da descrição do problema, ou ainda pelo fim da descrição do problema.

Palavra: um símbolo que contenha apenas letras a-z ou A-Z, e pode terminar com um único ponto.

Comprimento da palavra: número de letras de uma palavra (um ponto não é uma letra).


Exemplos de símbolos que são palavras (aspas duplas apenas para exemplificar): "AB", "ab".

Exemplo de símbolos que não são palavras: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".


O comprimento médio das palavras é dado pela soma dos tamanhos das palavras do enunciado dividido pelo numero de palavras, a divisão é feita por números inteiros. Se o número de palavras for zero, então o comprimento médio das palavras é zero.


Sua tarefa é dado o enunciado do problema, computar a sua classificação de dificuldade do problema, que poderá ser 250, 500, ou 1000.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que contém o enunciado de um problema, é uma string que contém entre 1 e 50 caracteres ('A'-'Z', 'a'-'z', '0'-'9', ' ', '.'), inclusive. O final da entrada é determinado por EOF.

Saída
Compute o comprimento médio das palavras do enunciado do problema, e mostre a classificação do problema, para mais detalhes olhe o exemplo abaixo.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_1243_How_Easy{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            String[] words = text.split("\\s+"); 
            
            int sum = 0;
            int count = 0;
            
            for (String obj : words) {
                if (obj.isEmpty()) continue;
                
                boolean isWord = true;
                int letterCount = 0;
                
                for (int i = 0; i < obj.length(); i++) {
                    char c = obj.charAt(i);
                    
                    if (Character.isLetter(c)) {
                        letterCount++;
                    } else if (c == '.' && i == obj.length() - 1) {
                    } else {
                        isWord = false;
                        break;
                    }
                }
                if (isWord && letterCount > 0) {
                    sum += letterCount;
                    count++;
                }
            }
            int result = (count == 0) ? 0 : sum / count;
            
            if (result <= 3) {
                System.out.println("250");
            } else if (result == 4 || result == 5) {
                System.out.println("500");
            } else {
                System.out.println("1000");
            }
        }
        sc.close();
    }
}