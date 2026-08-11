class Solution {
    public int minSteps(String s, String t) {

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char ch1 = t.charAt(i); 
            char ch2 = s.charAt(i);
            freq[ch1-'a']++;
            freq[ch2-'a']--; 
        }
        
        int count = 0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                if(freq[i]>0){
                    count += freq[i];
                }else{
                    int positivecount = freq[i] * (-1);
                    count += positivecount;
                }
            }
        }

        return count/2;

    }
}