/*
🇺🇸 English

Larissa is a very intelligent and studious scholar, so she is engaged in various activities. The end of the year, the month of hers final presentation, has arrived. She, very busy, needs to know if she can perform her presentation before Christmas! But prior to her presentation she must undergo a check with her oriental counselor, Prof. Takanada

Input
The input is composed of an  E (0 < E < 25) value representing the day the final thesis was delivered for verification. A value  D (0 < D < 25)  representing the end date to be submitted for verification.

Output
Show, for each test case, whether the scholar will make the presentation or not. The only possibility of delivery not to be performed on the date is due to lack of guidance from Takanada. If it is not possible, print "Eu odeio a professora!". If it is delivered within 3 days before the deadline, print "Muito bem! Apresenta antes do Natal!", Otherwise, being very close to the deadline, print "Parece o trabalho do meu filho!", In the latter case, it is added plus two days for corrections, and if the end date is shorter than the day before Christmas (24), it can be presented, and "TCC Apresentado!"" should be printed, otherwise print "Fail! Entao eh nataaaaal!".

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Larissa é uma acadêmica muito inteligente e estudiosa, com isso ela é engajada em várias atividades. Chegou o final do ano, mês da sua apresentação de TCC. Ela, muito atarefada, precisa saber se vai conseguir realizar sua apresentação antes do Natal! Mas antes de sua apresentação ela deve passar por uma verificação com sua orientadora oriental, a Prof.Takanada (/Tá com nada/).

Entrada
A entrada é composta por um valor E (0 < E < 25) representando o dia que foi entregue o tcc pra verificação. Um valor D (0 < D < 25) que representa a data final pra entregar para verificação.

Saída
Mostre, para cada caso de teste, se a acadêmica apresentará ou não. A única possibilidade da entrega não ser realizada na data é por falta de orientação da Takanada. Caso não seja possivel, imprima "Eu odeio a professora!". Caso seja entregue em até 3 dias antes do prazo final, imprima "Muito bem! Apresenta antes do Natal!", caso contrário, sendo muito próximo da data limite imprima "Parece o trabalho do meu filho!", nesse ultimo caso, é adicionado mais dois dias para correções, e caso a data final seja menor que a véspera do natal(24), ela poderá apresentar, sendo impresso "TCC Apresentado!", caso contrário imprima "Fail! Entao eh nataaaaal!"

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2930_Final_Thesis_of_Christmas_Depression {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int d = sc.nextInt();
        if (e > d) {
            System.out.println("Eu odeio a professora!");
        } else if ((d - e) > 2) {
            System.out.println("Muito bem! Apresenta antes do Natal!");
        } else {
            System.out.println("Parece o trabalho do meu filho!");
            if ((d + 2) >= 25) {
                System.out.println("Fail! Entao eh nataaaaal!");
            } else {
                System.out.println("TCC Apresentado!");
            }
        }
        sc.close();
    }
}
