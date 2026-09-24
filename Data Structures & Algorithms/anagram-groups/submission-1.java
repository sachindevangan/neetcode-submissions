class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];

        //convert to array and sort and back to sorted str

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        String sortedStr = new String(charArray);

        //check if it contains the string
        if(!map.containsKey(sortedStr)){
            map.put(sortedStr, new ArrayList<String>());
        }

        // add the sorted to the original list
        map.get(sortedStr).add(str);
        
    }
        return new ArrayList<>(map.values());

}
    
}
