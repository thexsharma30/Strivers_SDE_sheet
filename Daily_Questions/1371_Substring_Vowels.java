class Solution {
    public int findTheLongestSubstring(String s) {
        int n = s.length();
        int[] firstOccurrence = new int[32];
        for (int i = 0; i < 32; i++) {
            firstOccurrence[i] = -1;
        }
        firstOccurrence[0] = 0;
        
        int bitmask = 0;
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (ch == 'a') {
                bitmask ^= (1 << 0);
            } else if (ch == 'e') {
                bitmask ^= (1 << 1);
            } else if (ch == 'i') {
                bitmask ^= (1 << 2);
            } else if (ch == 'o') {
                bitmask ^= (1 << 3);
            } else if (ch == 'u') {
                bitmask ^= (1 << 4);
            }
            
            if (firstOccurrence[bitmask] != -1) {
                maxLength = Math.max(maxLength, i + 1 - firstOccurrence[bitmask]);
            } else {
                firstOccurrence[bitmask] = i + 1;
            }
        }
        
        return maxLength;
    }
}
