class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(' ');
        }
        for(int i=0;i<indices.length;i++){
            result.setCharAt(indices[i],s.charAt(i));
        }
        return result.toString();
    }
}