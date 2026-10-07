import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> seenCharacters = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (seenCharacters.contains(s.charAt(right))) {
                seenCharacters.remove(s.charAt(left));
                left++;
            }
            seenCharacters.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

public class Problem03 {
    public static void main(String[] args) {            
        Solution s = new Solution();
        String sop = "asdefasde"; 
        System.out.println("Length: " + s.lengthOfLongestSubstring(sop));
    }
}
