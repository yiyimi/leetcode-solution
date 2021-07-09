class Solution {
    public int majorityElement(int[] nums) {
        int majorVal = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                majorVal = num;
            }
            if (majorVal == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (majorVal == num) {
                count++;
            }
        }
        return count > nums.length / 2? majorVal: -1;
    }
}
