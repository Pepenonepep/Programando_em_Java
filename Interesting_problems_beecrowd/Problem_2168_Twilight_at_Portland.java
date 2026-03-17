/*
🇺🇸 English

At Twilight the Portland city is full of vampires and werewolves. However, none of them wants to be seen while walking downtown.

At each corner of Portland downtown, one surveillance camera will be installed. A monthly updated map with all working cameras is made available at City Hall website. 

A block is considered safe if there is at least two working cameras in its four corners. At Portland downtown all the blocks are squares with the same size.

Your task is, given the working cameras map, to indicate the status of all downtown blocks.

Input
The first line of input has a positive integer N (1 ≤ N ≤ 100). For the next N+1 lines there are N+1 numbers in each, indicating, for each corner, the presence or absence of a working surveillance camera. The number 1 represents a working camera at that corner, and the number zero represents there is no working camera in that corner.

Output
The output is given in N lines. Each line has N characters, indicating whether the corresponding block is safe or unsafe. If a block is safe, you must print the character S; if it is not safe, print the character U.

/* Class name must be "Main" for your solution to execute */

/*
🇧🇷 Portugues 

No crepúsculo, a cidade de Portland fica cheia de vampiros e lobisomens. Entretanto, nenhum deles quer ser visto enquanto passeiam pelo centro.

Vão ser instaladas câmeras de vigilância em cada esquina do centro de Portland. A cada mês, um mapa atualizado com as câmeras já em funcionamento é disponibilizado no site da prefeitura.

Uma quadra é considerada segura se existem câmeras em, pelo menos, duas de suas quatro esquinas. No centro de Portland todas as quadras são quadrados de mesmo tamanho.

Sua tarefa é, dado o mapa das câmeras em funcionamento nas esquinas, indicar o status de todas as quadras do centro.

Entrada
A primeira linha da entrada tem um inteiro positivo N (1 ≤ N ≤ 100). Nas próximas N+1 linhas, existem N+1 números, que indicam, para cada esquina, a presença ou ausência de uma câmera de vigilância em funcionamento. O número 1 indica que existe uma câmera funcionando na esquina, enquanto o número zero indica que não há câmera funcionando.

Saída
A saída é dada em N linhas. Cada linha tem N caracteres, indicando se a quadra correspondente é segura ou insegura. Se uma quadra é segura, mostre o caractere S; se não é segura, mostre o caractere U.

/*O nome da classe deve ser "Main" para que a sua solução execute */

package Interesting_problems_beecrowd;

import java.util.*;
import java.io.*;


public class Problem_2168_Twilight_at_Portland {
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n=sc.nextInt();
        if(n<1 || n>100){
            sc.close();
            return;
        }
        n+=1;
        int[][] esquinas = new int[n][n];
        for(int l=0;l<n;l++){
            for(int c=0;c<n;c++){
                esquinas[l][c] = sc.nextInt();
                int e = esquinas[l][c];
                if(e!=1 && e!=0){
                    sc.close();
                    return;
                }
            }
        }
        int cont=0;
        for(int l=0;l<n;l++){
            for(int c=0;c<n;c++){
                if(c<n-1 && l<n-1){
                    int posicaoAtual=esquinas[l][c];
                    int direita = esquinas[l][c+1];
                    int baixo = esquinas[l+1][c];
                    int diagonalDireitaInferior = esquinas[l+1][c+1];
                    if((direita ==1 && posicaoAtual==1) || (baixo==1 && posicaoAtual==1) || (diagonalDireitaInferior==1 && posicaoAtual==1)  || (direita ==1 && baixo==1) || (direita ==1 && diagonalDireitaInferior==1) || (baixo==1 && diagonalDireitaInferior==1)){
                        if(cont==n-2){
                            System.out.println("S");
                            cont=0;
                        }
                        else{
                            System.out.print("S");
                            cont++;
                        }
                    }
                    else{
                        if(cont==n-2){
                            System.out.println("U");
                            cont=0;
                        }
                        else{
                            System.out.print("U");
                            cont++;
                        }
                    }
                    
                }
                    
                }
        }




        sc.close();
    }
}
