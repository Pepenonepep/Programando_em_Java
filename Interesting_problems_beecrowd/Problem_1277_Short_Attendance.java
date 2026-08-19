/*
🇺🇸 English

The students at your university have lately picked up the annoying habit of missing classes. To fix this problem your board has decided to only allow students with 75% or higher attendance to sit for the exams.

From a list of students' names and their respective attendance records, print out the list of students who did not attend to enough classes and will be denied to sit for exams.

Input
The input contains several test cases. The first input line will contain an integer T indicating the number of test cases that follow.
Each test case is composed of three input lines:

The first line of a test case will contain an integer N (0 ≤ N ≤ 100) indicating the number of students in the class.
The second line will contain N student names with up to 50 chars each, separated by a single space character. All names will contain only uppercase or lowercase letters (‘A’-‘Z’,‘a’-‘z’).
The third line will contain N attendance records, corresponding to their respective students from the previous line. The attendance records will be separated by a single space character, and contain only ‘A’, ‘P’ and ‘M’ characters. A ‘P’ indicates that the student was present in a class, ‘A’ shows that he was absent (he did not attend) and ‘M’ shows that he was absent for a class but submitted a doctor's note then that class is not counted when calculating his attendance percentage. An attendance record will contain at least one ‘A’ or ‘P’ character.
Output
For each test case print out the names of all the students who do not meet the attendance requirements, separated by a single space character. Do not leave trailing spaces in the end of each line.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Os estudantes da tua universidade recentemente adquiriram o desagradável hábito de cabular as aulas. Para enfrentar este problema o seu Conselho de Professores decidiu somente permitir que estudantes com ao menos 75% de presença prestem os exames. A partir de uma lista de nomes de estudantes e seus respectivos registros de frequência, imprima o nome dos estudantes que não obtiveram o mínimo de presença às aulas e que consequentemente não poderão prestar os exames.

Entrada
A entrada possui diversos casos de testes. A primeira linha da entrada contém um inteiro T, que indica o número de casos de testes que se seguem.

Cada caso de teste é composto por três linhas:

A primeira linha de um caso de teste irá conter um inteiro N (0 ≤ N ≤ 100) que indica o número de estudantes na turma.
A segunda linha conterá N nomes de estudantes com até 50 caracteres cada nome, separados por um único espaço. Todos os nomes irão conter somente letras maiúsculas e minúsculas (‘A’-‘Z’,‘a’-‘z’).
A terceira linha conterá N registros de frequência, correspondentes aos respectivos estudantes da linha anterior. Os registros virão separados por um único espaço, e contêm apenas os caracteres ‘A’, ‘P’ e ‘M’. Um ‘P’ indica que o estudante estava presente à aula, ‘A’ indica que ele estava ausente (ele cabulou à aula) e ‘M’ mostra que, apesar de não ir à aula, ele entregou um atestado médico, então esta aula não deverá ser considerada no cálculo da frequência do estudante. Registros de frequência conterão ao menos um caracter ‘A’ ou ‘P’.
Saída
Para cada caso de teste imprima os nomes de todos os estudantes que não cumpriram a presença mínima requerida, separados por um espaço. Não deixe espaços sobrando no final da linha.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_1277_Short_Attendance{

    public static boolean checkTrueFrequence(String frequence) {
        
        int totalAulas = 0;
        int ausent = 0;
        
        for(int i = 0; i < frequence.length(); i++) {
            char word = frequence.charAt(i);
            if(word == 'A') {
                ausent++;
                totalAulas++;
            } else if (word == 'P') {
                totalAulas++;
            }
        }
        
        double minFrequence = (totalAulas * 75.0) / 100.0;
        
        if((totalAulas - ausent) >= minFrequence) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            
            for(int i = 0; i < t; i++) {
                int n = sc.nextInt();
                sc.nextLine(); 
                
                String names = sc.nextLine();
                String[] namesArray = names.trim().split("\\s+");
        
                String frequence = sc.nextLine();
                String[] frequenceArray = frequence.trim().split("\\s+");
        
                StringBuilder saida = new StringBuilder();
                boolean primeiroNome = true;
        
                for(int j = 0; j < n; j++) {
                    if(checkTrueFrequence(frequenceArray[j])) {
                        if (!primeiroNome) {
                            saida.append(" ");
                        }
                        saida.append(namesArray[j]);
                        primeiroNome = false;
                    }
                }
                System.out.println(saida.toString());
            }
        }
        sc.close();
    }
}