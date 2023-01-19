class Solution {
    public boolean isIsomorphic(String s, String t) {

    HashSet<Character> hashS = new HashSet<Character>();
    HashSet<Character> hashT = new HashSet<Character>();
    
    for(int i = 0; i < s.length(); i++)
    {
        hashS.add(s.charAt(i));
    }
    for(int j = 0; j < t.length(); j++)
    {
        hashT.add(t.charAt(j));
    }
    
    if(hashS.size()==hashT.size()){
        
        return true;
    }
    return false;

    }



}