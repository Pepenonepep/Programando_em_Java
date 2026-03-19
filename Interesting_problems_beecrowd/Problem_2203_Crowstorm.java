/*
🇺🇸 English

Fiddlesticks is a champion of League of Legends, he has as his ultimate ability "CrowStorm", it works as follows:

First Fiddlesticks chooses a strategic location and promptly he prepares to resurface in one direction within a certain distance, then it is rooted and channels the ultimate by just 1.5 seconds, after that time it resurfaces immediately at the target site with a flock of crows flying in the around and causing much damage.

Fiddlesticks want your help to find out if in a certain position it is possible to achieve an invader with his ultimate skill.

Note: Consider that Fiddlesticks always uses his ultimate exactly in the direction of ivasor and the invader always tries to flee in the opposite direction to Fiddlesticks, at a constant speed.



Input
The entry consists of several lines, each line contains the following integer values: Xf, Yf, Xi, Yi, Vi, R1 e R2(0 ≤ Xf, Yf, Xi, Yi, Vi, R1 e R2 ≤ 100), representing respectively the coordinates of Fiddlesticks, the initial coordinates of the invader, the speed of the invader, the ultimate of casting radius and flight radius of crows. Consider the unit of measurement as the meter.

Output
In the output you should print for each line the 'Y' character if it is possible to achieve the invasor or 'N' otherwise, both followed by a line break.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Fiddlesticks é um campeão do jogo League of Legends e tem como sua habilidade ultimate a "Tempestade de Corvos", ela funciona da seguinte maneira:

Primeiro Fiddlesticks escolhe um local estratégico e prontamente ele se prepara para ressurgir em uma direção até uma certa distância, então ele se enraiza e canaliza a ultimate por exatamente 1.5 segundos, após esse tempo ele ressurge imediatamente no local alvo com uma revoada de corvos voando ao seu redor e causando muito dano.

Fiddlesticks quer sua ajuda para saber se de uma certa posição é possível atingir um invasor com sua habilidade ultimate.

Obs: Considere que Fiddlesticks sempre luta exatamente na direção do invasor e o invasor sempre tenta fugir na direção contrária a Fiddlesticks, em velocidade constante.



Entrada
A entrada é composta de várias linhas, cada linha contém os seguintes valores inteiros: Xf, Yf, Xi, Yi, Vi, R1 e R2(0 ≤ Xf, Yf, Xi, Yi, Vi, R1 e R2 ≤ 100), representando respectivamente as coordenadas de Fiddlesticks, as coordenadas iniciais do invasor, a velocidade do invasor, o raio de conjuração da ultimate e o raio de voo dos corvos. Considere a unidade de medida como sendo o metro.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;

public class Problem_2203_Crowstorm {
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while(sc.hasNextInt()){
         int Xf=sc.nextInt();
        int Yf=sc.nextInt();
        int Xi=sc.nextInt();
        int Yi=sc.nextInt();
        int Vi=sc.nextInt();
        int R1=sc.nextInt();
        int R2=sc.nextInt();
        if(Xf<0 || Yf<0 || Xi<0 || Yi<0 ||  Vi<0 || R1<0 || R2<0 || Xf>100 || Yf>100 || Xi>100 || Yi>100 ||  Vi>100 || R1>100 || R2>100){
            sc.close();
            return;
        }
        double distanceFiddlesticks = Xf-Xi;
        distanceFiddlesticks= Math.pow(distanceFiddlesticks,2);
        double distanceEnemy = Yf-Yi;
        distanceEnemy= Math.pow(distanceEnemy,2);
        double distanceOfBeggin= distanceFiddlesticks+distanceEnemy;
        distanceOfBeggin = Math.sqrt(distanceOfBeggin);

        double distanceOfFinal = distanceOfBeggin+(Vi*1.5);
        if(distanceOfFinal<=(R1+R2)){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        
    }
        sc.close();
    
    }
}
