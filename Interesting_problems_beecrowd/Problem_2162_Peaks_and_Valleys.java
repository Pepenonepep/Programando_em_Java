/*
🇺🇸 English

Professor MC realized that at each 100 meter interval there is a peak in the Nlogony landscape. And that at exactly half way of each two peaks there is a valley. That means that at each 50 meters there is a valley or a peak and, alongside the landscape, there is not a peak followed by another peak neither there is a valley followed by another valley.

Professor MC got curious with that pattern and wants to know if this happens again to other landscapes. Your task is, given a landscape, to indicate if it has this pattern.

Input
The input is given in two lines. The first one has the number N of landscape measures (1 < N ≤ 100). The second line has N integers: the height Hi of each measure (-10000 ≤ Hi ≤ 10000, for all Hi, such that 1 ≤ i ≤ N). A measure is considered a peak if it is higher than the previous measure. A measure is considered a valley if it is lower than the previous measure.

Output
The output is given in one single line. If the landscape has the same pattern of Nlogony it must be shown the number 1. Otherwise, the number 0 must be shown.



/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

Ao observar a paisagem da Nlogônia, o professor MC percebeu que a cada intervalo de 100 metros existe um pico. E que exatamente na metade de dois picos há um vale. Logo, a cada 50 metros há um vale ou um pico e, ao longo da paisagem, não há um pico seguido por outro pico, nem um vale seguido por outro vale.

O professor MC ficou curioso com esse padrão e quer saber se, ao medir outras paisagens, isso se repete. Sua tarefa é, dada uma paisagem, indicar se ela possui esse padrão ou não.

Entrada
A entrada é dada em duas linhas. A primeira tem o número N de medidas da paisagem (1 < N ≤ 100). A segunda linha tem N inteiros: a altura Hi de cada medida (-10000 ≤ Hi ≤ 10000, para todo Hi, tal que 1 ≤ i ≤ N). Uma medida é considerada um pico se é maior que a medida anterior. Uma medida é considerada um vale se é menor que a medida anterior.

Saída
A saída é dada em uma única linha. Caso a paisagem tenha o mesmo padrão da Nlogônia, deve ser mostrado o número 1. Caso contrário, mostra-se o número 0.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;
import java.util.*;
import java.io.*;

public class Problem_2162_Peaks_and_Valleys{
    public static void main(String[]args)throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];
        for(int i = 0; i < N; i++){
            vet[i] = sc.nextInt();
        }

        boolean valido = true;
        for(int i = 1; i < N; i++){
            if(vet[i] == vet[i-1]){ 
                valido= false;
                break;
            }
        }
        if(valido){
            for(int i = 2; i < N; i++){
                boolean sobeAntes = vet[i-1] > vet[i-2]; 
                boolean sobeAgora = vet[i]   > vet[i-1];
                if(sobeAntes == sobeAgora){  
                    valido = false;
                    break;
                }
            }
        }

        System.out.println(valido ? 1 : 0);

        sc.close();

    }
}