import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
            if(i>0&&arr[i]==arr[i-1]){
                stack.pop();
            }
        }
        return stack;
    }
}