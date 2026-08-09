class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for(int i=0;i<address.length();i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                result.append("[.]");
                continue;
            }
            result.append(address.charAt(i));
        }

        return result.toString();
    }
}