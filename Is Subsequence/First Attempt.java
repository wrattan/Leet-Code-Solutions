class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
           return false; 
        }
	
        if(s.length()==0){
            return true;
        }       
	
        HashMap<Character, Integer> u
            = new HashMap<Character, Integer>();
        String Compare = "";
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
           char tempChar_S = s.charAt(i);

            for(int j=0;j<t.length();j++){
                char tempChar_T = t.charAt(j);
                if(tempChar_S == tempChar_T){
                    u.put(s.charAt(i),j);
                }
            }
        }
        Iterator hmIterator = u.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            myList.add((int)mapElement.getValue());
            Compare = Compare + mapElement.getKey();
        }
        System.out.println(s);
        System.out.println(myList);
        System.out.println(Compare);
       
        if(isSortedList(myList)==false){
            return false;
        }
        
        if(Compare.equals(s)){
            return true;
        }


        return false;

    }
    public static boolean isSortedList(List<? extends Comparable> list)
{
    if(list == null || list.isEmpty())
        return false;

    if(list.size() == 1)  
        return true;

    for(int i=1; i<list.size();i++)
    {
        if(list.get(i).compareTo(list.get(i-1)) < 0 )
            return false;
    }

    return true;    
}



}