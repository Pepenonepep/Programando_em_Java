/*🇺🇸 English
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

/*On LeetCode, the problem must be submitted using only the Solution class.*/

/* 🇧🇷 Portugues 
Os numerais romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M.

Símbolo       Valor
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Por exemplo, o número 2 é escrito como II em numerais romanos, sendo apenas dois "uns" somados. O número 12 é escrito como XII, que é simplesmente X + II. O número 27 é escrito como XXVII, que é XX + V + II.

Os numerais romanos são geralmente escritos do maior para o menor, da esquerda para a direita. No entanto, o numeral para quatro não é IIII. Em vez disso, o número quatro é escrito como IV. Como o "um" vem antes do "cinco", nós o subtraímos, resultando em quatro. O mesmo princípio se aplica ao número nove, que é escrito como IX. Existem seis casos em que a subtração é utilizada:

I pode ser colocado antes de V (5) e X (10) para formar 4 e 9.
X pode ser colocado antes de L (50) e C (100) para formar 40 e 90.
C pode ser colocado antes de D (500) e M (1000) para formar 400 e 900.
Dado um numeral romano, converta-o para um número inteiro.

 

Exemplo 1:

Entrada: s = "III"
Saída: 3
Explicação: III = 3.
Exemplo 2:

Entrada: s = "LVIII"
Saída: 58
Explicação: L = 50, V = 5, III = 3.
Exemplo 3:

Entrada: s = "MCMXCIV"
Saída: 1994
Explicação: M = 1000, CM = 900, XC = 90 e IV = 4.
 

Restrições:

1 <= s.length <= 15
s contém apenas os caracteres ('I', 'V', 'X', 'L', 'C', 'D', 'M'). É garantido que s é um numeral romano válido no intervalo [1, 3999].
 */

/*No LeetCode, a questão deve ser submetida usando apenas a classe Solution. */

package Problems_LeetCode;

public class Problem_13_Roman_to_Integer {
class Solution{
    public int valueRoman(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

      public int romanToInt(String s){
        char[] arrayC = s.toCharArray();
        int output=0;
        for(int i=0;i<arrayC.length;i++){
            int value = valueRoman(arrayC[i]);
            if(i+1<arrayC.length && value<valueRoman(arrayC[i+1])){
                output-=value;
            }
            else{
                output+=value;
            }
        }
        return output;
      }
}
}
