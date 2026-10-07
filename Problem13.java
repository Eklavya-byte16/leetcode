import java.util.*;

class Solution {
    Stack<Integer> Value = new Stack<>();
    
    int output(String input) {
        Value.clear();
        for (int i = 0; i < input.length(); i++) { 
            switch (input.charAt(i)) {
                case 'I': Value.add(1); break;
                case 'V': Value.add(5); break;
                case 'X': Value.add(10); break;
                case 'L': Value.add(50); break;
                case 'C': Value.add(100); break;
                case 'D': Value.add(500); break;
                case 'M': Value.add(1000); break;
            }
        }

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
        
            if (i > 0 && Value.elementAt(i) > Value.elementAt(i - 1)) {
                
                sum -= 2 * Value.elementAt(i - 1);
            }
            
            
            sum += Value.elementAt(i);
        }
        return sum;
    }
}

public class Problem13 {
    public static void main(String[] arg) {
        Solution s = new Solution();
        
        
        System.out.println("--- Test Case 1 ---");
        s.output(Input(1)); 
    }   

    static String Input(int c) {
        switch (c) {
            case 1: return "III";
            case 2: return "LVII";
            case 3: return "MCMXCIV";
            default: return "III";
        }
    }
}
