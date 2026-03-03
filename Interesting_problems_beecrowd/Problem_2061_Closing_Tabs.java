/*🇺🇸 English

Péricles has an unique interest in history. With his up-to-date internet browser chromed fox, he wandered in the most obscure sites about ancient Greek mythology.

By some type of cosmic irony, Péricles' browser was infected by a malware with a peculiar characteristic: every time Péricles closed a tab in his browser, another two opened! However, when Péricles clicked one of the ads (all tabs were infested with ads), the tab crashed, and no other tabs were opened.

Your taks is to compute the final number of tabs of Péricles's browser, knowing the initial number of tabs and the actions taken by Péricles. There are two possible actions: fechou (when Péricles closed a tab) and clicou (when Péricles clicked on an ad).

Input
The input is initiated by a line containing two integer numbers, N and M (0 < N, M < 500), representing the initial number of tabs and the number of actions performed by Péricles. Each subsequent line contains an action (fechou or clicou). Naturally, the current number of tabs is always greater or equal to zero.

Output
The output must consist of a line containing the final number of tabs.

Input Sample	Output Sample
3 5
fechou
fechou
clicou
clicou
clicou

2

/* Class name must be "Main" for your solution to execute */

/* 🇧🇷 Portugues 

Péricles é um rapaz que tem um interesse único por história. Utilizando seu atualizadíssimo navegador de internet rapoza cromada, conheceu até os sitios mais remotos e obscuros atrás de informações sobre a mitologia grega.

Por ironia do destino, o navegador de Péricles acabou sendo infectado por um malware com uma caracterísica peculiar: cada vez que Péricles fechava uma aba no seu navegador, outras duas abas apareciam! No entanto, quando Péricles clicou sem querer em uma das propagandas de uma aba, percebeu que, por um erro do navegador, a aba foi encerrada (sem abrir outras abas). Por causa do malware, todas as abas possuem irritantes propagandas.

Sua tarefa é descobrir com quantas abas que o navegador de Péricles ficou, sabendo o número inicial de abas e a sequência de ações de Péricles. As ações podem ser fechou (quando Péricles fechou uma aba) ou clicou (quando Péricles clicou em uma propaganda).

Entrada
A entrada é iniciada por uma linha contendo dois números inteiros positivos, N e M (0 < N, M < 500), representando o número inicial de abas e o número de ações de Péricles. Cada linha subsequente contém uma ação (fechou ou clicou). Naturalmente, o número de abas é sempre maior ou igual a zero.

Saída
A saída deve ser uma linha contendo o número final de abas.

Exemplo de Entrada	Exemplo de Saída
3 5
fechou
fechou
clicou
clicou
clicou

2 
*/
/* O nome da classe deve ser "Main" para que a sua solução execute */


package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2061_Closing_Tabs{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N>0 && M<500){
        for(int i=0;i<M;i++){
            String comando = sc.next();
            if(!comando.equalsIgnoreCase("fechou") && !comando.equalsIgnoreCase("clicou")){
                sc.close();
                return;
            }
            else {
                if(comando.equalsIgnoreCase("fechou")){
                    N+=1;
                }
                else{
                    N-=1;
                }
            }
        }

        System.out.println(N);
        sc.close();
    }

        sc.close();
        return;
    }

}