import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();  
        
        // stack에 ')'이 먼저 push되거나 마지막이 '('이면 false다.  
        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '(') {  
                stack.push('(');  
            } else if (s.charAt(i) == ')') {
                // stack(0)이 ')'이면 false
                if (stack.isEmpty()) {  
                    return false;  
                }  
                stack.pop();  
            }  
        }
        // stack()이 empty이면 이상이 없으므로 turu
        // empty가 아니면 짝이 안맞으므로 false
        return stack.isEmpty();  
    }  
}