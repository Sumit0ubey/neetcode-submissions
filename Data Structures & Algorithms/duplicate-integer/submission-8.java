class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> non_duplicate = new HashSet<>(nums.length);

        for (int num : nums){
            if (!non_duplicate.add(num)){
                return true;
            }
        }
        return false;
    }
}