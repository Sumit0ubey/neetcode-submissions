class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> non_duplicate = new ArrayList<>();

        for (int num : nums){
            if (non_duplicate.contains(num)){
                return true;
            }
            non_duplicate.add(num);
        }
        return false;
    }
}