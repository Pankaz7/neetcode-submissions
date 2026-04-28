class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left=0;
        int maxlength=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
        
    }
}
