class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //step1 count frequency
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        //step 2 create bucket 
        List<Integer>[] bucket = new List[nums.length+1];
         for(int num:map.keySet()){
            int freq=map.get(num);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
         }

         //step3 Read bucket Right to left

         int [] result = new int[k];
         int idx=0;
         for (int i = bucket.length-1;i>=0 && idx < k;i--){
            if(bucket[i] != null){
                for(int num:bucket[i]){
                    result[idx++] = num;
                    if (idx == k) break;
                }

            }
         }

        return result;
    }
}