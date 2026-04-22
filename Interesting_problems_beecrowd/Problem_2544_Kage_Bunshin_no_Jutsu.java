package Interesting_problems_beecrowd;

import java.util.Scanner;
import java.io.IOException;

public class Problem_2544_Kage_Bunshin_no_Jutsu{

    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        int N = sc.nextInt();
            int e = (int) (Math.log(N) / Math.log(2));
            
            System.out.println(e);
        
        }
        
        sc.close();
    }
}