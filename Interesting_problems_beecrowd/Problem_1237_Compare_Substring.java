/*
🇺🇸 English

Find the longest common substring between the two informed Strings. The substring can be any part of the String, including the entire String. If there is no common substring, return 0. The search is case sensitive ('x' != 'X').

Input
The input contains several test cases. Each test case is composed by two lines that contains a string each. Both input Strings will contain between 1 and 50, inclusive, letters (a-z, A-Z), and/or spaces.

Output
The length of the longest common substring between the two Strings.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
O tamanho da maior subsequência comum entre as duas Strings.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_1237_Compare_Substring{
    public static int subString(String text1, String text2){
        int bigger=0;
        for(int i=0;i<text1.length();i++){
            for(int j=i+1;j<=text1.length();j++){
            String part = text1.substring(i,j);
            if(text2.contains(part)){
                if(bigger<part.length()){
                    bigger = part.length();
                    }
                }
            }    
        }
        
        return bigger;
    }
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String text1 = sc.nextLine();
            String text2 = sc.nextLine();
            System.out.println(subString(text1,text2));
        }
        
        sc.close();
    }
}