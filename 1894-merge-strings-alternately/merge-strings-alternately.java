class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int point1 = 0;
        int point2 = 0;

        while(point1 != word1.length() || point2 != word2.length()){
            if(point1!=word1.length()){
                sb.append(word1.charAt(point1));
                point1++;
            }
            if(point2!=word2.length()){
                sb.append(word2.charAt(point2));
                point2++;
            }

        }
        return sb.toString();
    }
}