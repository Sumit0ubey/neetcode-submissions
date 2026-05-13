class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if (len(strs) == 0):
            return []
        
        maps = {}

        for word in strs:
            count = [0] * 26

            for letter in word:
                count[ord(letter) - ord('a')] += 1
            
            key = str(count)
            if not key in maps:
                maps[key] = []
            
            maps[key].append(word)
        
        return list(maps.values())