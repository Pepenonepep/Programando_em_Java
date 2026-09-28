/*🇺🇸 English
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/

/*On LeetCode, the problem must be submitted using only the Solution class.*/

/* 🇧🇷 Portugues 
Escreva uma função para encontrar a string com o prefixo comum mais longo em um array de strings.

Se não houver prefixo comum, retorne uma string vazia "".

Exemplo 1:

Entrada: strs = ["flower","flow","flight"]
Saída: "fl"
Exemplo 2:

Entrada: strs = ["dog","racecar","car"]
Saída: ""
Explicação: Não há prefixo comum entre as strings de entrada.

Restrições:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] contém apenas letras minúsculas do alfabeto inglês se não estiver vazio.
 */

/*No LeetCode, a questão deve ser submetida usando apenas a classe Solution. */

package Problems_LeetCode;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }
}