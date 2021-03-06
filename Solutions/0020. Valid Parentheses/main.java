import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<Character>(); 
        
        for (char c : s.toCharArray()) { 
            switch(c) {
                case ')': 
                    if (stack.isEmpty()  || stack.pop() != '(') return false; 
                    break; 
                case '}': 
                    if (stack.isEmpty() || stack.pop() != '{') return false; 
                    break; 
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false; 
                    break;
                default: 
                    stack.push(c); 
                    break; 
            }
        }
        
        return stack.isEmpty(); 
    }
}