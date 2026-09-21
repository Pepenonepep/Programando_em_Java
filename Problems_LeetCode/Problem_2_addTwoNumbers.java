/*🇺🇸 English
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

/*On LeetCode, the problem must be submitted using only the Solution class.*/


/* 🇧🇷 Portugues 
São fornecidas duas listas encadeadas não vazias que representam dois números inteiros não negativos. Os dígitos estão armazenados em ordem inversa, e cada nó contém um único dígito. Some os dois números e retorne a soma como uma lista encadeada.

Você pode assumir que os dois números não contêm zeros à esquerda, exceto o próprio número 0.

 

Exemplo 1:


Entrada: l1 = [2,4,3], l2 = [5,6,4]
Saída: [7,0,8]
Explicação: 342 + 465 = 807.
Exemplo 2:

Entrada: l1 = [0], l2 = [0]
Saída: [0]
Exemplo 3:

Entrada: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Saída: [8,9,9,9,0,0,0,1]
 

Restrições:

O número de nós em cada lista encadeada está no intervalo [1, 100].
0 <= Node.val <= 9
É garantido que a lista representa um número que não possui zeros à esquerda.
 */

/*No LeetCode, a questão deve ser submetida usando apenas a classe Solution. */

package Problems_LeetCode;

public class Problem_2_addTwoNumbers {
    class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dummy = new ListNode(0);
          ListNode actual = dummy;  
          int carry = 0;
          while(l1 != null || l2 != null || carry!=0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int soma = val1 + val2 + carry;
            carry = soma / 10;
            actual.next = new ListNode(soma%10);
            actual = actual.next;

            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
          }
          return dummy.next;
        }
    }
}
