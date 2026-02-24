import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws Exception{
        

        Scanner sc = new Scanner(System.in);

         int m,n,i,j;
        System.out.println("A MATRIZ VAI TER QUANTAS LINHAS: ");
        m = sc.nextInt();
        System.out.println("A MATRIZ VAI TER QUANTAS COLUNAS: ");
        n = sc.nextInt();
        System.out.println();
        System.out.println(" MATRIZ DE ["+m+"] POR ["+n+"] ");
        System.out.println();

        int[][] mat = new int [m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println("Elemento ["+i+","+j+"]: ");
                mat[i][j] = sc.nextInt(); 
            }
        }
        System.out.println();
        System.out.println(" MATRIZ DIGITADA: ");

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }

        
        sc.close();
    }
}