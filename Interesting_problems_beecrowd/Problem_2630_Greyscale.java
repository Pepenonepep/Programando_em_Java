/*
🇺🇸 English

Some image processing algorithms require preprocessing in which it is necessary to turn a color image into a greyscale image. This conversion can be done in several ways, depending on the result you want to achieve.

To preserve the perception of basic colors by the human eye, an appropriate conversion would be to take 30% of the red component (R), 59% of the green component (G) and 11% of the blue component (B). In mathematical terms:

P = 0, 30R + 0, 59G + 0, 11B

Other possible approaches would be to determine the value of P through the arithmetic mean of the three components or assign P to the highest or the lowest values among the three components.

Given the RGB components of one pixel of the color image, determine the value of pixel P of the corresponding gray scale image, determining the conversion to be used. Neglect the decimal part of the result, if it exists.

Input
The input in T (1 ≤ T ≤ 100) test cases, where the value of T is given in the first line of the input. Each test case consists of two lines: the first line contains the conversion to be used: eye for the first approach described, mean for the arithmetic mean, max for the largest component value and min for the lowest component value. The second line contains the R, G, B (0 ≤ R, G, B ≤ 255) values of the colored image pixel.

Output
For each test case the following message "Caso #t: P" should be printed, where P is the gray level of the pixel of the grayscale image after the conversion of the colored image pixel. This message must be followed by a line break.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Alguns algoritmos de processamento de imagem exigem um pré-processamento no qual é necessário transformar uma imagem colorida em uma imagem em tons de cinza. Esta conversão pode ser realizada de diversas maneiras, dependendo do resultado que se pretende obter.

Para preservar a percepção das cores básicas pelo olho humano, uma conversão apropriada seria tomar 30% da componente vermelha (R), 59% da componente verde (G) e 11% da componente azul (B). Em termos matemáticos,

P = 0, 30R + 0, 59G + 0, 11B

Outras abordagens possíveis seriam determinar o valor de P através da média aritmética das três componentes ou atribuir a P os valores da maior ou da menor entre as três componentes.

Dadas as componentes RGB de um pixel da imagem colorida, determine o valor do pixel P da imagem em tons de cinza correspondente, determinada a conversão a ser utilizada. Despreze a parte decimal do resultado, caso exista.

Entrada
A entrada em T (1 ≤ T ≤ 100) casos de teste, onde o valor de T é dado na primeira linha da entrada. Cada caso de teste é composto por duas linhas: a primeira linha contém a conversão a ser utilizada: eye para a primeira abordagem descrita, mean para a média aritmética, max para o valor da maior componente e min para o valor da menor componente. A segunda linha contém os valores R, G, B (0 ≤ R, G, B ≤ 255) do pixel da imagem colorida.

Saída
Para cada caso de testes dever ser impressa a seguinte mensagem "Caso #t: P", onde P é o nível de cinza do pixel da imagem em tons de cinza após a conversão do pixel da imagem colorida. Esta mensagem deve ser seguida de uma quebra de linha.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;


public class Problem_2630_Greyscale{
    public static double eyeResult(int R, int G, int B){
        return (0.30*R + 0.59*G + 0.11*B);
    }
    
    public static double meanResult(int R, int G, int B){
        return (R+G+B)/3.0;
    }
    
     public static int minResult(int R, int G, int B){
        if(R<G && R<B){
            return R;
        }
        else if(G<R && G<B){
            return G;
        }
        return B;
    }
    
     public static int maxResult(int R, int G, int B){
         if(R>G && R>B){
            return R;
        }
        else if(G>R && G>B){
            return G;
        }
        return B;
    }
    
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String word = sc.nextLine();
            int R=sc.nextInt();
            int G=sc.nextInt();
            int B=sc.nextInt();
            sc.nextLine();
            if(word.equals("mean")){
              sb.append("Caso #"+(i+1)+": "+(int)meanResult(R,G,B)+"\n");
            }
            else if(word.equals("min")){
                 sb.append("Caso #"+(i+1)+": "+minResult(R,G,B)+"\n");
            }
            else if(word.equals("max")){
                 sb.append("Caso #"+(i+1)+": "+maxResult(R,G,B)+"\n");
            }
            else{
                 sb.append("Caso #"+(i+1)+": "+(int)eyeResult(R,G,B)+"\n");
            }
        }
        System.out.print(sb.toString());
        
        sc.close();
    }
}