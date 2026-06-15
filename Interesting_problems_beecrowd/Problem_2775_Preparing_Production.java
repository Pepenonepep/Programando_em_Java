/*
🇺🇸 English

A car assembler allows users to create their own vehicle designs the way they want and still share that information with other users in order to create a diverse network of users. The process begins with the customer developing his own model through a software, soon after completion, the project data are stored and according to the availability of the assembler are being carried out.

But a failure to deliver parts to the automaker is delaying orders. It turns out that the parts are delivered in packages, labeled with a number, that should be ordered in an increasing order for the production to begin. The failure is that the packages are being delivered in a random manner. You should create a program in which given the order of delivery of the packages and the time that each of them takes to be changed of position, calculate the total time to organize the packages. It is known that for the purpose of organization within the company, packages should be changed from position only two to two and if they are side by side.

Input
The input consists of several test cases, read up to EOF. For each case, the first value of the input is an integer N (1 <= N <= 1000) representing the number of packets, soon after there will be two lines with N integers each, with the numbers of the packets, in the order of delivery, and the time that the nth packet takes to be replaced, respectively.

It is guaranteed that the packet numbers for each test case form a permutation of integers from 1 to N, and that no packet takes more than one minute to move.

Output
Your program should present, for each test case, a single integer representing the total time to organize the packages.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Uma montadora de carros, permite que os usuários criem seus próprios projetos de veículos da maneira que desejar e ainda compartilhar tais informações com outros usuários com o intuito de criar uma rede de utilizadores bem diversificada. O processo se inicia com o cliente desenvolvendo seu próprio modelo através de um software, logo após a conclusão, os dados do projeto são armazenados e de acordo com a disponibilidade da montadora vão sendo realizados.

Porém uma falha na entrega das peças para a montadora está atrasando os pedidos. Acontece que as peças são entregues em pacotes, etiquetados com um número, que deveriam estar ordenados de forma crescente para que a produção inicie. A falha é que os pacotes estão sendo entregues de uma forma aleatória. Você deve criar um programa em que dados a ordem de entrega dos pacotes e o tempo que cada um deles leva para ser trocado de posição, calcule o tempo total para organizar os pacotes. Sabe-se que para efeito de organização dentro da empresa, os pacotes devem ser trocados de posição somente dois a dois e se estiverem um do lado do outro.

Entrada
A entrada consiste de vários casos de testes, lidos até EOF. Para cada caso, o primeiro valor da entrada é um inteiro N (1 <= N <= 1000) representando a quantidade de pacotes, logo após haverá duas linhas com N inteiros cada, com os números dos pacotes, na ordem da entrega, e o tempo, em segundos, que o n-ésimo pacote leva para ser trocado de lugar, respectivamente.

É garantido que os números dos pacotes para cada caso de teste forma uma permutação dos inteiros de 1 a N, e que nenhum pacote demora mais do que um minuto para mover.

Saída
Seu programa deve apresentar, para cada caso de teste, um único inteiro que representa o tempo total para organizar os pacotes.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Problem_2775_Preparing_Production {
    public static class Ordem {
        public int sum;
        public boolean sucesso;
    }

    public static void troca(List<Integer> list, int indiceP, int indiceF) {
        int aux = list.get(indiceP);
        list.set(indiceP, list.get(indiceF));
        list.set(indiceF, aux);
    }

    public static Ordem naOrdem(int tam, List<Integer> listN, List<Integer> listT) {
        Ordem o = new Ordem();
        o.sucesso = true;
        o.sum = 0;
        for (int i = 1; i < tam; i++) {
            if (listN.get(i) < listN.get(i - 1)) {
                troca(listN, i, i - 1);
                troca(listT, i, i - 1);

                o.sum += listT.get(i) + listT.get(i - 1);
                o.sucesso = false;
            }
        }

        return o;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            List<Integer> ListaDeNumerosPacotes = new ArrayList<Integer>();
            List<Integer> ListaDeTempoEmSec = new ArrayList<Integer>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                ListaDeNumerosPacotes.add(x);
            }
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                ListaDeTempoEmSec.add(x);
            }
            Ordem o = new Ordem();
            int tempoTotal = 0;
            while (o.sucesso == false) {
                o = naOrdem(n, ListaDeNumerosPacotes, ListaDeTempoEmSec);
                tempoTotal += o.sum;
            }
            System.out.println(tempoTotal);
        }
        sc.close();
    }
}