import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()){
            return false;
        }
        int[] charCount1 = new int[256];
        int[] charCount2 = new int[256];
        
        for (char c : s.toCharArray()) {
            charCount1[c]++;
        }
        for (char c : t.toCharArray()) {
            charCount2[c]++;
        }
        return Arrays.equals(charCount1, charCount2);
    }
    
}