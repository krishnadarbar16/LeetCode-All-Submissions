class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWords = 0;
        
        for(int i=0;i<sentences.length;i++){
            int count = 1;
            for(int j=0;j<sentences[i].length();j++){
                char ch = sentences[i].charAt(j);
                if(ch == ' '){
                    count++;
                }
            }
            if(count>maxWords){
                maxWords = count;
            }
        }
        return maxWords;
    }
}