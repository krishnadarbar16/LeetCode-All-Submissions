class Solution {
    public boolean detectCapitalUse(String word) {
        
        int capCount = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='A' && ch<='Z'){
                capCount++;
            }
        }

        char ch = word.charAt(0);
        if(capCount == 0 || capCount == word.length()){
            return true;
        }else if(capCount == 1 && ch>='A' && ch<='Z'){
            return true;
        }

        return false;
    }
}