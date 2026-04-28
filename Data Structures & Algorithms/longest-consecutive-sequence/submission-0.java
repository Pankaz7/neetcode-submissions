class Solution {
    public int longestConsecutive(int[] nums) {

        //step1:put all the nos.in Hashset
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest=0;

        //step2:find sequence stars
        for(int n : set){
            if(!set.contains(n-1)){
                int length=1;
                int current=n;
          
            while(set.contains(current + 1)){
                current++;
                length++;
            }
            longest=Math.max(longest,length);
        }
        }
        
        return longest;
    }
}
