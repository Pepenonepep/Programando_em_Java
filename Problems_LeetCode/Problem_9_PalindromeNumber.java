/*🇺🇸 English
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:

-231 <= x <= 231 - 1
*/

/*On LeetCode, the problem must be submitted using only the Solution class.*/

/* 🇧🇷 Portugues 
Dado um número inteiro x, retorne verdadeiro se x for um palíndromo e falso caso contrário.

Exemplo 1:

Entrada: x = 121
Saída: verdadeiro
Explicação: 121 é lido como 121 da esquerda para a direita e da direita para a esquerda.
Exemplo 2:

Entrada: x = -121
Saída: falso
Explicação: Da esquerda para a direita, lê-se -121. Da direita para a esquerda, torna-se 121-. Portanto, não é um palíndromo.
Exemplo 3:

Entrada: x = 10
Saída: falso
Explicação: Lê-se 01 da direita para a esquerda. Portanto, não é um palíndromo.

Restrições:

-2³¹ <= x <= 2³¹ - 1
 */

/*No LeetCode, a questão deve ser submetida usando apenas a classe Solution. */

package Problems_LeetCode;

public class Problem_9_PalindromeNumber {
    class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int j=0;
        for(int i=number.length()-1;i>=0;i--){
            if(number.charAt(i) != number.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
}
