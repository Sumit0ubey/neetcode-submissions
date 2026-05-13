class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0){
            return new ArrayList();
        }

        HashMap<String, List> map = new HashMap<>();
        int[] counts = new int[26];

        for (String word: strs){
            Arrays.fill(counts, 0);

            for (char letter: word.toCharArray()){
                counts[letter - 'a']++;
            }

            StringBuilder builder = new StringBuilder("");
            for (int i = 0; i < 26; i++){
                builder.append("#");
                builder.append(counts[i]);
            }

            String key = builder.toString();
            if (!map.containsKey(key)){
                map.put(key, new ArrayList());
            }

            map.get(key).add(word);
        }

        return new ArrayList(map.values());
    }
}
