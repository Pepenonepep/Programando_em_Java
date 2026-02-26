/*
Description of problem: 
Julius is the owner of a large apiry situated in Paraíba. Every year, every six months, Julius collect honey produced by bees of their property and stores it in a CYLINDRICAL container format that facilitates the transport of honey for establishments who order this natural product for commercialization . Once Julio realized due to an increase in honey production, over the previous six months, the container that owned the stand the volume of honey produced by his bees. Julius needs now that you make a program that informs the volume of honey in cm3 and the diameter of the inside of the container in cm, calculate and show:

- What should be the height (in cm) of Inside the container;

- The area (in cm2) of the mouth (entrance) of the container.

NB .: Consider π = 3.14

Input
The input contains several test cases and ends with EOF. Each test case consists of a line containing two floating-point values of double precision with two decimals after comma, one V (1.00 ≤ V ≤ 10000.00) and one D (1.00 ≤ D ≤ 100.00), respectively representing the volume and the container diameter.

Output
For each test, the output contains the first line "ALTURA = " message, with a space after ALTURA and another after the symbol of equality, followed by the container height value with two decimals after comma and the second line message "AREA = ", also with a space after AREA and another after the symbol of equality, followed by the value of the area of the mouth (entrance) of the container with two decimals after comma.

- Do not forget the line break at the end of the exit, otherwise you will get "Presentation Error". 

/*
Class name must be "Main" for your solution to execute
*/

/*
Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba. Todo ano, semestralmente, seu Júlio coleta o mel produzido pelas abelhas da sua propriedade e armazena-o em um recipiente de formato CILÍNDRICO para que facilite o transporte do mel para os estabelecimentos que encomendam esse produto natural para a comercialização.
Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, em relação ao semestre anterior, o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas. Seu Júlio precisa agora que você faça um programa que informado o volume de mel em cm3 e o diâmetro da parte interna do recipiente em cm, calcule e mostre:

- Qual deve ser a altura(em cm) da parte interna do recipiente;

- A área(em cm2) da boca(entrada) do recipiente.

Obs.: Considere π = 3.14

Entrada
A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de duas linhas contendo em cada uma um valor de ponto flutuante de dupla precisão com duas casas decimais após a vírgula, sendo um V (1.00 ≤ V ≤ 10000.00) e outro D (1.00 ≤ D ≤ 100.00), representando respectivamente o volume e o diâmetro do recipiente.

Saída
Para cada teste, a saída contém na primeira linha a mensagem "ALTURA = ", com um espaço depois de ALTURA e outro depois do símbolo de igualdade, seguido do valor da altura do recipiente com duas casas decimais após a vírgula e na segunda linha a mensagem "AREA = ", também com um espaço depois de AREA e outro depois do símbolo de igualdade, seguido do valor da area da boca(entrada) do recipiente com duas casas decimais após a vírgula.

- Não esqueça da quebra de linha ao final da saída,caso contrário você receberá "Presentation Error".
 */

/*
O nome da classe deve ser "Main" para que a sua solução execute
*/


package Interesting_problems_beecrowd;
import java.io.*;
import java.util.*;

public class Problem_2029_Honey_Reservoir {
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextDouble()){
            double v = sc.nextDouble();
            if(v<1.00 || v>10000.00){
                sc.close();
                return;
            }
            double d = sc.nextDouble();
            if(d<1.00 || d>10000.00){
                sc.close();
                return;
            }
            double raio =d/2.0;
            double area = 3.14*(raio*raio);
            double altura = v/area;
            
            System.out.println("ALTURA = "+String.format("%.2f",altura));
            System.out.println("AREA = "+String.format("%.2f",area));
            
            
        }
        
        sc.close();
        
    }
}