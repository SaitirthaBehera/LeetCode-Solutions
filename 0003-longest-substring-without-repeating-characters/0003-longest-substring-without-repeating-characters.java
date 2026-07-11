class Solution {
    public int lengthOfLongestSubstring(String s) {
        int rcount=0;
        int i=0;
        java.util.HashSet<Character> charSet=new java.util.HashSet<>();
        for (int j=0;j<s.length();j++){
            while(charSet.contains(s.charAt(j))){
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));
            int count = j-i+1;
            rcount=Math.max(rcount,count);

        }
        return rcount;
             
    }
}