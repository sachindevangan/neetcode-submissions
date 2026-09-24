class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String,List<String>> map = new HashMap<>();

       for(int i =0; i < strs.length; i++){
        String str = strs[i];

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        String SortedStr = new String(charArray);

        if(!map.containsKey(SortedStr)){
            map.put(SortedStr, new ArrayList<String>());
        }
         map.get(SortedStr).add(str);
       }

       return new ArrayList<>(map.values());
      
}

    
}
