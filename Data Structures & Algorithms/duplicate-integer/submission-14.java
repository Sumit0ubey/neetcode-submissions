class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashSet<Integer> non_duplicate = new HashSet<>(nums.length);

        // for (int num : nums){
        //     if (!non_duplicate.add(num)){
        //         return true;
        //     }
        // }
        // return false;

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++){
        //     if (nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}