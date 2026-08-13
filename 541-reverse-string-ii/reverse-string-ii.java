class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder result = new StringBuilder();

        int left = 0;
        int right = k - 1;
        int count = 1;

        while (left < s.length()) {

            String str;

            if (right >= s.length()) {
                str = s.substring(left, s.length());
            } else {
                str = s.substring(left, right + 1);
            }

            if (count % 2 != 0) {
                result.append(rev(str));
            } else {
                result.append(str);
            }

            left += k;
            right += k;
            count++;
        }

        return result.toString();
    }

    static String rev(String s) {
        StringBuilder revS = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            revS.append(s.charAt(i));
        }

        return revS.toString();
    }
}