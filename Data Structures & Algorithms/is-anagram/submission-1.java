class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();

         //count s
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c , 0) + 1);
        }

        for(char c:t.toCharArray()){
            map.put(c , map.getOrDefault(c,0) - 1 );
           if ( map.get(c) < 0 ) return false;
        }
        return true;

    }
}
