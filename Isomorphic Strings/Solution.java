class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Boolean> mapT = new HashMap<>();

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        for(int i = 0; i < arrS.length; i++)
        {
            if(mapS.containsKey(arrS[i]))
            {
                char temp = mapS.get(arrS[i]);
                if(temp != arrT[i]) return false;
            }
            else
            {
                if(mapT.containsKey(arrT[i])) return false;
                else
                {
                    mapS.put(arrS[i], arrT[i]);
                    mapT.put(arrT[i], true);
                }
            }
        }
        return true;
    }
}