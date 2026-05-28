/*
🇺🇸 English

The vehicle restriction of São Paulo city is a restriction on the circulation of motor vehicles in the city. Implemented since 1996 with the aim of improving environmental conditions by reducing the burden of pollutants in the atmosphere, it has consolidated itself as an instrument to reduce congestion in the main highways of the city, during peak times. In the boundary ways, traffic of trucks and automobiles that are within the restriction is not allowed. There is a scale that determines on which days of the week which vehicles can not travel. This scale is governed by the last digit of the vehicle nameplate, being: 

Monday, final digit of board 1 and 2 
Tuesday, final digit of plate 3 and 4 
Wednesday, digit end of plate 5 and 6 
Thursday, final digit of plate 7 and 8 
Friday, final digit of plate 9 and 0 
The drivers who are caught violating the traffic restriction are charged with a fine and four points in the driver's license.

Input
The first entry line represents the number of N tests (1 <= N <1000) that should be considered. The other entries are string with maximum size S (1 <= S <= 100) representing each card to be analyzed, so that each card is on a single entry line. The expected format for a valid car plate in São Paulo is "AAA-9999", such that A is a valid character in [A-Z], and 9 is a valid numeric digit in [0-9].

Output
The set of valid values ​​as output are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY and FRIDAY, according to the predefined constraint table, and FAILURE if the board does not present the defined pattern.

/* Class name must be "Main" for your solution to execute */
/* Retire: "package Interesting Problems Beecrowd;" */

/*
🇧🇷 Portugues 

O rodízio municipal de veículos de São Paulo é uma restrição à circulação de veículos automotores na cidade. Implantado desde 1996 com o propósito de melhorar as condições ambientais reduzindo a carga de poluentes na atmosfera, se consolidou como um instrumento para reduzir congestionamentos nas principais vias da cidade, nos horários de maior movimento. Nas vias delimitadoras não é permitido o tráfego de caminhões e automóveis que estejam dentro da restrição. Há uma escala que determina em quais dias da semana quais veículos não podem circular. Essa escala é regida pelo último dígito da placa do veículo, sendo:

Segunda-feira, digito final da placa 1 e 2
Terça-feira, digito final da placa 3 e 4
Quarta-feira, digito final da placa 5 e 6
Quinta-feira, digito final da placa 7 e 8
Sexta-feira, digito final da placa 9 e 0
Os motoristas que são flagrados violando a restrição de circulação são autuados com multa e quatro pontos na carteira de habilitação.

Entrada
A primeira linha de entrada representa a quantidade de testes N (0 <= N < 1000) que deverão ser considerados. As demais entradas são cadeia de caracteres com tamanho máximo S (1 <= S <= 100) que representam cada placa que deverá ser analisada, de tal forma que, cada placa fique em uma única linha de entrada. O formato esperado para uma placa veicular válida em São Paulo é "AAA-9999", tal que A é um caracter válido em [A-Z], e 9 um dígito numérico válido em [0-9].

Saída
O conjunto de valores válidos como saída são: MONDAY, TUESDAY, WEDNESDAY, THURSDAY e FRIDAY, de acordo com a tabela de restrições predefinida, e FAILURE caso a placa não apresente o padrão definido.

/*O nome da classe deve ser "Main" para que a sua solução execute */
/* Retire: "package Interesting_problems_beecrowd;" */

package Interesting_problems_beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Problem_2712_Vehicular_Restriction {
    public static boolean podeletra(char letra, int j) {
        boolean sucesso = true;
        if (j == 3) {
            if (letra != '-') {
                sucesso = false;
            }
        } else if (j == 4 || j == 5 || j == 6 || j == 7) {
            if ((letra < '0' || letra > '9')) {
                sucesso = false;
            }
        } else if (j == 2 || j == 1 || j == 0) {
            if (letra < 'A' || letra > 'Z') {
                sucesso = false;
            }
        }
        return sucesso;
    }

    public static String dia(char letra) {

        switch (letra) {
            case '0':
                return "FRIDAY";
            case '1':
                return "MONDAY";
            case '2':
                return "MONDAY";
            case '3':
                return "TUESDAY";
            case '4':
                return "TUESDAY";
            case '5':
                return "WEDNESDAY";
            case '6':
                return "WEDNESDAY";
            case '7':
                return "THURSDAY";
            case '8':
                return "THURSDAY";
            case '9':
                return "FRIDAY";
        }
        return "FAILURE";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            StringBuilder st = new StringBuilder();
            String texto = sc.next();
            if (texto.length() != 8) {
                System.out.println("FAILURE");
                continue;
            }
            for (int j = 0; j < texto.length(); j++) {
                char letra = texto.charAt(j);
                if (!podeletra(letra, j)) {
                    st.append("FAILURE");
                    break;
                }
                if (j == 7) {
                    String diaPelofinal = dia(letra);
                    st.append(diaPelofinal);
                }
            }
            System.out.println(st.toString());
        }
        sc.close();
    }
}
