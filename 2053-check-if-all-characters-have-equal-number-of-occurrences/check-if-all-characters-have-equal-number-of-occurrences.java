class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        char c = s.charAt(0);
        int occurence = freq[c-'a'];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(occurence!=freq[ch-'a']) return false;
        }

        return true;
    }
}