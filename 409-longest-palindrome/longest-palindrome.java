class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;        
        int[] freq = new int[52];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='a' && ch<='z'){
                freq[ch-'a']++;
            }else{
                freq[ch-'A'+26]++;
            }
        }

        int anagramLength = 0;
        for(int i=0;i<52;i++){
            if(freq[i]==1){
                continue;
            }else if(freq[i]%2 != 0){
                anagramLength += freq[i]-1;
            }else{
                anagramLength += freq[i];
            }
        }

        if(anagramLength<s.length()){
            anagramLength++;
        }

        return anagramLength;

    }
}