/*
🇺🇸 English

Often, when we round a real valued number to an integer, we round up if the fractional part is 0.5 or greater, and down if the fractional part is less than 0.5. In this problem, you have to write a method round, which takes a real valued number as a String, num, and a cutoff as a String, cutoff. cutoff will be formatted exactly as "0.####", where each '#' represents a digit ('0'-'9'). At least one of the digits to the right of the decimal point in cutoff will be non-zero. Your task is to round num up if its fractional part is greater than cutoff, and down otherwise, and return the result as an int. To avoid issues with double imprecision, the fractional part of num will not be exactly equal to cutoff. Hence, the traditional rounding method described in the opening sentence would be represented by cutoff = "0.5000".

Input
The input contains several test cases. Each one is given in two lines. The num string is at the first line and the cutoff is at the second line. num will be a sequence of one or more digits ('0'-'9'), with an optional decimal point ('.'). num will contain between 1 and 10 characters, inclusive. cutoff will be formatted exactly as "0.####", where each '#' represents a digit ('0'-'9'). The fractional part of num will NOT be exactly equal to cutoff.

The input is terminatted by EOF.

Output
Your program should output one line to each test case. This line contains only the integer part of num rounded up or down according to the given cutoff.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Frequentemente, ao arredondar um número real para um inteiro nós o fazemos para cima se a parte fracionária é maior ou igual a 0,5 e para baixo se a parte fracionária é menor do que 0,5. Neste problema você recebe uma string num contendo um número real e uma string cutoff contendo um valor de corte. A string cutoff será formatada exatamente como "0.####", onde cada '#' representa um dígito ('0'-'9'). Pelo menos um dos dígitos da parte fracionária de cutoff será diferente de zero. Sua tarefa é arredondar num para cima se a parte fracionária é maior do que o valor de corte e para baixo caso contrário, devolvendo o resultado como um inteiro. Para evitar problemas com imprecisão de representação em ponto flutuante a parte fracionária de num não será exatamente igual a cutoff. Assim, o método tradicional de arredondamento descrito na frase inicial seria representado por cutoff = "0.5000"

Entrada
A entrada contem vários casos de teste. Cada caso de teste é composto por duas linhas. A string num está na primeira linha e a string cutoff fica na segunda linha. A string num é formada por 1 ou mais dígitos ('0' a '9') com um ponto decimal opcional ('.'). A string num tem de 1 a 10 caracteres. A string cutoff é formatada exatamente como "0.####", onde cada '#' representa um dígito ('0' a '9'). Além disso, a parte fracionária de num NÃO será exatamente igual a cutoff.

O final da entrada é determinado por EOF.

Saída
Para cada caso de teste da entrada seu programa deve gerar uma linha de saída somente com a parte inteira de num arredondada de acordo com o valor de corte em cutoff.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_1305_Cut_Off_Rounder {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String numStr = sc.nextLine();
            
            if (!sc.hasNextLine()) {
                break;
            }
            String cutoffStr = sc.nextLine();
            
            double num = Double.parseDouble(numStr); 
            double cutoff = Double.parseDouble(cutoffStr);
        
            double fractionalPart = num - (int)num;
            
            if (fractionalPart >= cutoff) {
                System.out.println((int)num + 1);
            } 
            else {
                System.out.println((int)num);
            }
        }
        
        sc.close();
    }
}
