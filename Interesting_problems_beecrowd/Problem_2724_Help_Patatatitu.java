/*
🇺🇸 English

Juvenal behaved exemplary this year, since he likes chemistry deeply and really want to earn an Alchemy kit. However, Juvenal asked to include some dangerous elements in his kit. As Santa could not deny the request ( how to say no to the world most well behaved children?) asked to poor elf Patatatitu to ensure that the present was safe.

Patatatitu knows a lot about chemistry, and knows every dangerous compound that can be made with the elements available on Juvenal’s kit. Thus, he decided to send a cd together with the gift, containing a program which asserts the safety of Juvenal’s experiments. Everyone agrees that the world’s most well behaved children would never do an experiment without first checking it’s safety as per Santa instructions. However Patatatitu knows nothing about programming and is after someone to help him. Can you help?

To elucidate, Patatatitu explains that a dangerous compound are formed from a mix of elements in theirs chemical formula respecting it’s order and proportions. In this kit it’s possible to add one element each time, in various quantities. Thus, to form chlorine trifluoride (ClF3), an extremely dangerous compound, you must add an atom of chlorine (Cl) and three of fluorine (F3), regardless of what was added before or after. ClF4 is not a dangerous compound since it’s a different proportion from ClF3. Similarly, if Mg2F is a dangerous compound, Mg2Fe is safe, since fluorine (F) is different from iron (Fe).

Input
The input consist of an integer N (0 < N < 10) which indicates the number of test cases. Each test case have an integer T (0 < T < 51) which indicates the number of dangerous compounds possible, if th elements are included in the order and proportions shown. Follow T lines, each containing a string up to 50 characters representing a formula that generates a dangerous compound if the elements are added in that particular order and proportion. After, is given an integer U (0 < T < 51) that indicates the number of experiments Juvenal will do. Follow U lines each containing an string up to 50 characters representing the elements that Juvenal will use in the order and proportions as they are added.

Output
The output consist of U per test case, which must inform if Juvenal must abort it’s experiment or proceed with the U-th experiment of the test case. If Juvenal must abort print “Abortar”, else if it’s safe print “Prossiga”.Test cases must be separated by a blank line .

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting_problems_beecrowd;" */

/*
🇧🇷 Portugues 

Juvenal comportou-se muito bem este ano, já que gosta muito de química e queria muito ganhar um kit Alquimia. Entretanto, Juvenal pediu para incluir alguns elementos perigosos em seu kit. Seu Noel não podendo negar o pedido ( afinal, como dizer não para a criança mais bem comportada do planeta?) pediu para o pobre elfo Patatatitu garantir que o presente fosse seguro.

Patatatitu sabe muito sobre química, e conhece todos os compostos perigosos que podem ser feitos com os elementos disponíveis no kit de Juvenal. Assim, decidiu enviar um cd junto com o presente, contendo um programa que afira a segurança dos experimentos de Juvenal. Todos concordam que a criança mais bem-comportada do planeta nunca faria uma experiência sem antes checar sua segurança conforme as instruções. Porém Patatatitu não sabe programar e está atrás de ajuda. Você poderia ajudá-lo?

Para facilitar, Patatatitu explica que um composto perigoso é formado a partir da mistura de elementos na ordem de sua fórmula atômica e respeitando as devidas proporções. Neste kit de química é possível apenas adicionar um elemento por vez, em diferentes quantidades. Assim para formar trifluoreto de cloro (ClF3), um composto muito perigoso, deve-se adicionar um átomo cloro (Cl) e três de flúor (F3), independentemente do que for adicionado antes ou depois. ClF4 não é um composto perigoso, pois está fora de proporção. De forma similar caso Mg2F seja um composto perigoso, Mg2Fe será seguro, visto que flúor (F) é um elemento distinto de ferro (Fe).

Entrada
A entrada consiste de um inteiro N (0 < N < 10) que indica o número de casos de teste. Cada caso de teste consiste em um inteiro T (0 < T < 51) que indica o número de compostos perigosos possíveis, caso os elementos sejam incluídos na ordem e proporções mostradas. Seguem T linhas, cada uma contendo uma string de até 50 caracteres representando uma formula que gera um composto perigoso caso os elementos sejam misturados na ordem e proporções que são apresentados. Após isso, é dado um inteiro U (0 < U < 51) que indica a quantia de experiencias que Juvenal irá realizar. Seguem U linhas cada uma contendo uma string de até 50 caracteres representando os elementos que Juvenal utilizara na ordem e proporções em que serão adicionados.

Saída
A saída consiste de U linhas por caso de teste, as quais devem informar se Juvenal deve prosseguir ou abortar o  U-ésimo  experimento do caso teste. Caso deva abortar imprima "Abortar", caso seja seguro imprima "Prossiga".Deixe uma linha em branco entre cada caso de teste.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2724_Help_Patatatitu {
    public static boolean testeDePericulosidade(String VF_Perigosas[], String F_juvenal) {
        for (String F : VF_Perigosas) {
            int posicao = F_juvenal.indexOf(F);

            while (posicao != -1) {
                int indiceProximoChar = posicao + F.length();

                if (indiceProximoChar >= F_juvenal.length()) {
                    return false;
                }

                char letra = F_juvenal.charAt(indiceProximoChar);

                if (Character.isLowerCase(letra) || Character.isDigit(letra)) {

                    posicao = F_juvenal.indexOf(F, posicao + 1);
                } else {

                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                StringBuilder st = new StringBuilder();

                int quantidadeDeFormulasPerigosas = sc.nextInt();
                String[] vetorDeFormulasPerigosas = new String[quantidadeDeFormulasPerigosas];
                for (int j = 0; j < quantidadeDeFormulasPerigosas; j++) {
                    vetorDeFormulasPerigosas[j] = sc.next();
                }

                int quantidadeFormulasDeJuvenal = sc.nextInt();
                String[] vetorDeFormulasDeJuvenal = new String[quantidadeFormulasDeJuvenal];
                for (int z = 0; z < quantidadeFormulasDeJuvenal; z++) {
                    vetorDeFormulasDeJuvenal[z] = sc.next();
                }

                for (String p : vetorDeFormulasDeJuvenal) {
                    if (!testeDePericulosidade(vetorDeFormulasPerigosas, p)) {
                        st.append("Abortar\n");
                    } else {
                        st.append("Prossiga\n");
                    }
                }

                if (i < n - 1) {
                    st.append("\n");
                }
                System.out.print(st.toString());
            }
        }

        sc.close();
    }
}
