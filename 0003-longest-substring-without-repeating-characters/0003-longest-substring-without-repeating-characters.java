class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i=0; i<s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j=i; j<s.length(); j++) {
                char ch = s.charAt(j);
                if (str.indexOf(String.valueOf(ch))!=-1) {
                    break;
                }
                str.append(ch);
                maxLength = Math.max(maxLength, str.length());
            }
        }
      return maxLength;
    }
}