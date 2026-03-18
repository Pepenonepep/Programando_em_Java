/*
🇺🇸 English

Prog and Cackto recently started to play a role-playing game called Fortress. In this game, for player's evolve their level they need to defeat monsters, which gives a value of experience (XP) for player.

The producer of the game, Extreme Games, announced that next week will hold the first XP event of this game in which will increase monsters experience in an X value. As Prog and Cackto are at a very high level at which the monsters have a very high amount of experience points, they are having difficulties in calculating the amount of experience points that the monsters will have during the event. You can help them?

Input
There will be several test cases. Each test case contains two values: X (0 < X ≤ 3) indicating the increase in value of EXP from monsters and M (10 ≤ M ≤ 232-1) indicating the EXP value of the monster. The entry ends with values X == 0 and M == 0, in which should not be processed.

Output
For each case, your program should show a value E, value of new Monster EXP.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Prog e Cackto começaram recentemente a jogar um jogo de RPG chamado Fortaleza. Neste, para o jogador evoluir de nível o mesmo precisa derrotar monstros, nos quais dá um valor de experiência (XP) para o jogador.

A produtora do jogo, Jogos Extremos, anunciou que na próxima semana irá realizar o primeiro evento XP no qual aumentará a experiência dos monstros em X vezes. Como Prog e Cackto estão em um nível muito alto no qual os monstros tem um valor muito alto de pontos de experiência, eles estão tendo dificuldades de calcular a quantidade de pontos de experiência que os monstros terão durante o evento. Você pode ajudá-los?

Entrada
Haverá diversos casos de teste. Cada caso de teste contém dois valores X (0 < X ≤ 3) indicando o valor de aumento da EXP dos monstros e M (10 ≤ M ≤ 232-1) indicando o valor de EXP do monstro. A entrada termina com os valores X == 0 e M == 0, nos quais não devem ser processados.

Saída
Para cada caso, seu programa deverá mostrar um valor E, referente ao novo EXP do monstro.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2172_Event {
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x=sc.nextInt();
        if(x<=0 || x>3){
            sc.close();
            return;
        }
        int m=sc.nextInt();
        if(m<10 || m>Math.pow(2,32)-1){
            sc.close();
            return;
        }
        while(x!=0 && m!=0){
            System.out.println(x*m);
            x=sc.nextInt();
        if(x<=0 || x>3){
            sc.close();
            return;
        }
        m=sc.nextInt();
        if(m<10 || m>Math.pow(2,32)-1){
            sc.close();
            return;
        }
        }

        sc.close();
    }
}
