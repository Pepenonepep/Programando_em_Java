/*
🇺🇸 English

Samu Elmito loves creating peculiar games to challenge his friends. This time, he made a game called "Jogo do Operador" (Operation Game), in which he creates basic expresssions and each player must choose an expression and fill the gap with the correct operation to validate it. The players may choose 1 out of 3 operations: addition, subtraction and multiplication. However, if the player thinks there's no operation among the 3 operations that validates the expression, he can anwser Impossible.

Your task is simple: given the expressions and the players' answer, determine which players won't proceed to the next phase of the game.

Input
The input consists of an integer T (2 ≤ T ≤ 50) that indicates the number of expression and the number of players. Each test case consists of T expressions like "X Y=Z", indicating that X operation Y (0 ≤ X, Y ≤ 103) is equal to Z (-103 ≤ Z ≤ 106), followed by T players and his respective answers like "N E R", with N being the player's name (up to 50 characters and no blank spaces), E being the index of the chosen expression (1 ≤ E ≤ T) and R the answer (+, -, * or I, indicating Impossible). Read input until EOF.

Output
For each test case, if every player can proceed, print "You Shall All Pass!"; if no player can proceed, print "None Shall Pass!"; otherwise, print, in lexicographical order and between blank spaces, the name of the players who gave the wrong answer and won't proceed to the next phase.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

Samu Elmito adora criar jogos peculiares para desafiar seus amigos. Desta vez, ele inventou um jogo chamado "Jogo do Operador", em que ele cria expressões básicas e cada jogador deve escolher uma expressão e preencher a lacuna com o operador correto para validá-la. Os jogadores poderão escolher operadores de somente três tipos: adição, subtração e multiplicação. Porém, se o jogador achar que não há operador entre os três tipos que valide a expressão, poderá responder Impossível.

Sua tarefa é simples: dadas as expressões e as respostas dos jogadores, determinar os jogadores que não passarão para a outra fase do jogo.

Entrada
A entrada é composta por um inteiro T (2 ≤ T ≤ 50) que indica a quantidade de expressões e de jogadores. Cada caso de teste é composto por T expressões na forma "X Y=Z", indicando que X operador Y (0 ≤ X, Y ≤ 103) é igual a Z (-103 ≤ Z ≤ 106), seguido de T jogadores e suas respectivas respostas na forma "N E R", sendo N o nome do jogador (até 50 caracteres e sem espaços), E o índice da expressão escolhida (1 ≤ E ≤ T) e R a resposta (+, -, * ou I, indicando Impossível). A entrada termina com EOF (fim de arquivo).

Saída
Para cada caso de teste, se todos os jogadores passarem, imprima "You Shall All Pass!"; se nenhum jogador passar, imprima "None Shall Pass!"; caso contrário, imprima, em ordem lexicográfica e entre espaços, o nome dos jogadores que erraram a resposta e, desta forma, não passarão para a próxima fase do jogo.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */
package Interesting_problems_beecrowd; 

import java.util.Scanner;

import java.util.Locale;

import java.util.ArrayList;

import java.util.List;

import java.util.Collections;

import java.io.IOException;


public class Problem_2493_Jogo_do_Operador{

    public static class Expressao{

    public int x;

    public int y;

    public int z;



 public Expressao(int x, int y, int z){

     this.x = x;

     this.y = y;

     this.z = z;

     

 }

 public int getX(){
    return x;
 }
  public int getY(){
    return y;
 }
  public int getZ(){
    return z;
 }

}

    public static void main(String[]args)throws IOException{


        Scanner sc= new Scanner(System.in);

        Locale.setDefault(Locale.US);

        while(sc.hasNextInt()){
        int contnomes=0;
        int t = sc.nextInt();
        List<Expressao> listaDeExpressoes = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();

        if(t<2 || t>50){

            continue;

        }

        for(int p=1;p<=t;p++){

            sc.useDelimiter("[\\s=]+");

            int x=sc.nextInt();

            int y=sc.nextInt();

            if(x<0 || y>Math.pow(10,3)){

                continue;
            }

            int z=sc.nextInt();

            if(z<-Math.pow(10,3) || z>Math.pow(10,6)){

               continue;

            }

            listaDeExpressoes.add(new Expressao(x,y,z));

        }

         for(int p=1;p<=t;p++) {
           
             String nome = sc.next();
              sc.useDelimiter("[\\s]+");
            if(nome.length()<0 || nome.length()>50){

               continue;

            }

            int e = sc.nextInt();
            
            if(e<1 || e>t){

               continue;

            }

            char simbolo = sc.next().charAt(0);
            
            if(simbolo!='+' && simbolo != '-' && simbolo != '*' && simbolo != 'I'){

               continue;

            }
           
           for(int pos=0;pos<listaDeExpressoes.size();pos++){
                if(pos==e-1){
                   Expressao expressaoescolinha = listaDeExpressoes.get(pos);
                   switch(simbolo){
                    case '+': if(expressaoescolinha.x+expressaoescolinha.y != expressaoescolinha.z ){
                        reprovados.add(nome);
                        contnomes++;
                    }
                        break;
                    case '-': if(expressaoescolinha.x-expressaoescolinha.y != expressaoescolinha.z ){
                        reprovados.add(nome);
                         contnomes++;
                    }
                        break;
                    case '*': if(expressaoescolinha.x*expressaoescolinha.y != expressaoescolinha.z ){
                        reprovados.add(nome);
                         contnomes++;
                    }
                    break;
                    case 'I': if((expressaoescolinha.x+expressaoescolinha.y == expressaoescolinha.z)||(expressaoescolinha.x-expressaoescolinha.y == expressaoescolinha.z)||(expressaoescolinha.x*expressaoescolinha.y == expressaoescolinha.z)){
                        reprovados.add(nome);
                         contnomes++;
                    }
                        break;
                        
                   }
                } 
           }
          
        }                                 
           if(contnomes==0){
            System.out.println("You Shall All Pass!");
           }
           else if(contnomes==t){
            System.out.println("None Shall Pass!");
           }
           else {
            Collections.sort(reprovados);
            for (int i = 0; i < reprovados.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(reprovados.get(i));
            }
            System.out.println();
           }
        } // close while

        sc.close();

    }
} //finish

