/*
🇺🇸 English

There is a traditional industry in Brazil that produces musical equipment. Currently they are totally immersed with the era of Industry 4.0 and their main action is the creation of pedals of effects for guitar, that there are in an incredible diversity, each for a type of customer. This industry has implemented a system in which his client creates his own pedal through a 3D prototype and interactive, including with sounds, simulating the actual pedal. Therefore, after the client generates his model, the same one is sent to the company, where it will be manufactured.

To be fabricated, the pedal circuit is printed on a PCB(printed circuit board) which has a certain size. But with the creativity of the customers, the plates are taking unimaginable dimensions, this fact makes the plate available in the company does not serve. Since you are an excellent programmer and music lover, it is up to you to create a program in which given the dimensions of the client circuit and the size of the board available, tell whether or not you can use that board.

Input
The first line of each test case consists of three integers X, Y, M (M≤105) representing respectively the company board dimensions and the number of requests. For each of the next M lines will be provided two integers Xi and Yi representing the client's PCB dimensions.

Dimensions are guaranteed to be integer values greater than 0 and less or equal than 64.

The input ends with EOF.

Output
For each circuit determine whether it is possible to use the company's PCB or not.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Existe uma tradicional indústria no Brasil que produz equipamentos musicais. Atualmente eles estão totalmente imergidos com a era da Indústria 4.0 e a sua principal atuação é a criação de pedais de efeitos para guitarra, que existem em uma diversidade incrível, cada um para um tipo de cliente. Esta indústria implementou um sistema em que o seu cliente cria seu próprio pedal através de um protótipo 3D e interativo, inclusive com sons, simulando o pedal real. Sendo assim, após o cliente gerar seu modelo o mesmo é enviado para a empresa, onde será fabricado.

Acontece que para ser fabricado, o circuito do pedal é impresso em uma PCI(placa de circuito impresso), que tem um certo tamanho. Porém com a criatividade dos clientes, as placas estão tomando dimensões inimagináveis, tal fato faz com que a placa disponível na empresa não sirva. Como você é um excelente programador e um amante da música, cabe a você criar um programa em que dada as dimensões do circuito do cliente e a dimensão da placa disponível, diga se é possível utilizar ou não aquela placa.

Entrada
A primeira linha de cada caso de teste consiste de três inteiros X, Y, M (M≤105) representando respectivamente as dimensões da placa da empresa e a quantidade de pedidos. Para cada uma das próximas M linhas será fornecido dois inteiros Xi e Yi representando as dimensões da PCI do cliente.

É garantido que as dimensões são valores inteiros maiores que 0 e menor ou igual a 64.

A entrada termina com EOF.

Saída
Para cada circuito determine se é possível utilizar a PCI da empresa ou não.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2770_Board_Size {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            StringBuilder st = new StringBuilder();
            int x, y, m;
            x = sc.nextInt();
            y = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int o = sc.nextInt();
                int p = sc.nextInt();
                if ((o <= x && p <= y) || (o <= y && p <= x)) {
                    st.append("Sim\n");
                } else {
                    st.append("Nao\n");
                }
            }
            System.out.print(st.toString());
        }

        sc.close();
    }
}
