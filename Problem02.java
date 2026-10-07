import java.util.*;

/**
 * Solution
 */
class Solution {
    LinkedList<Integer> Adder(LinkedList<Integer> l1, LinkedList<Integer>l2){
        LinkedList<Integer> l3 =new LinkedList<Integer>();

        Collections.reverse(l1);
        Collections.reverse(l2);
    
        int i =0 ;int carry=0;

    while (l1.size() > i || l2.size()> i || carry !=0) {
        
        /**
         * Uses the single variable sum to manage the increment opprations;
        */
       int sum= carry;

       if (i< l1.size()) {
         sum += l1.get(i);
       }
       if (i<l2.size()) {
        sum += l2.get(i);
       }

       carry = sum /10;
       l3.set(i, sum%10);
       i++;

    }
        Collections.reverse(l3);
        return l3;
    
    }
    
}

