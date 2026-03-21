/*
🇺🇸 English

After capturing many Pomekons, Dabriel and Guarte resolved to make a battle. The way of the duel is simple, each Master puts a Pomekon in battle and wins who has the Pomekon with the bigger value.


The Bonus will be given to the Master Pomekon that are on a level of a value even.

This issue will be given to you the value of the applied bonuses, attack and defense values of Pomekon of Dabriel and Guarte and their levels, you have to inform the winner of the battle.

Input
The entrance is composed of several instances. The first line of input contains an integer T indicating the number of instances. Each instance starts with a integer B (0 ≤ B ≤ 100), which indicates the value of the applied bonus. In the following two lines will have three integers Ai, Di and Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), represented the attack value of Pokemon, the defense value and the level of the Master Pomekon. The first line is the Dabriel Pomekon and the second the Guarte.

Output
For each instance in the input you should print the Master's name that will win the battle, in the event of a tie print: "Empate" without quotes.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. A forma de duelo é simples, cada treinador coloca um Pomekon na batalha e vence quem tem o Pomekon com maior valor de golpe.


O Bônus será dado ao Pomekon do treinador que estiver em um level de valor par.

Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Pomekon de Dabriel e Guarte e seus respectivos níveis, cabe a você informar o ganhador da batalha.

Entrada
A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. Cada instância começa com um inteiro B (0 ≤ B ≤ 100), que indica o valor do bônus aplicado. Nas duas linhas seguintes terão três inteiros Ai, Di e Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. A primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.

Saída
Para instância na entrada você deverá imprimir o nome do treinador que irá vencer a batalha, em caso de empate imprima: "Empate", sem aspas.



/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;


public class Problem_2221_Pomekons_Battle {
    public static boolean eh_par(int x){
        boolean eh_par = false;

        if(x%2==0){
            eh_par=true;
        }
        else{
            eh_par=false;
        }

        return eh_par;
}

    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        int valor_golpe1=0;
        int valor_golpe2=0;
        for(int i=0;i<t;i++){
            int b=sc.nextInt();
            if(b<0 || b>100){
                sc.close();
                return;
            }
            int A1 = sc.nextInt();
            int D1 = sc.nextInt();
            int L1 = sc.nextInt();
            if(A1<1 || D1>100 || L1<1 || L1>50){
                sc.close();
                return;
            }
            int A2 = sc.nextInt();
            int D2 = sc.nextInt();
            int L2 = sc.nextInt();
            if(A2<1 || D2>100 || L2<1 || L2>50){
                sc.close();
                return;
            }
            if(eh_par(L1)==true){
                valor_golpe1=(A1+D1/2)+b;
                if(eh_par(L2)==true){
                valor_golpe2=(A2+D2/2)+b; 
                }
                else{
                valor_golpe2=(A2+D2/2);
                }
            }
            else{
                valor_golpe1=(A1+D1/2);
                if(eh_par(L2)==true){
                valor_golpe2=(A2+D2/2)+b; 
                }
                else{
                valor_golpe2=(A2+D2/2);
                }
            }
            if(valor_golpe1>valor_golpe2){
                System.out.println("Dabriel");
            }
            else if(valor_golpe1<valor_golpe2){
                System.out.println("Guarte");
            }
            else{
                System.out.println("Empate");
            }
        }
        sc.close();
    }
}
