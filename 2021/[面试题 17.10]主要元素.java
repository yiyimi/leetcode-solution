class Solution {
    /**
     * @author: yiyimi
     * date: 2021.7.9 17:07
     * @description: T(n)=O(n);S(n)=O(1).
     */
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
    
    /*
     * Boyer-Moore 投票算法基本思想:
     * 在每一轮投票过程中，从数组中删除两个不同的元素，直到投票过程无法继续，此时数组为空或者数组中剩下的元素都相等。
     * - 如果数组为空，则数组中不存在主要元素；
     * - 如果数组中剩下的元素都相等，则数组中剩下的元素可能为主要元素。
    Boyer-Moore 投票算法的步骤如下：
    1.维护一个候选主要元素 candidate 和候选主要元素的出现次数count，初始时 candidate 为任意值，count=0；
    遍历数组 nums 中的所有元素，遍历到元素 xx 时，进行如下操作：
    如果 count=0，则将 xx 的值赋给 candidate，否则不更新 candidate 的值；
    如果 x=candidate，则将 count 加 11，否则将 count 减 11。
    遍历结束之后，如果数组 nums 中存在主要元素，则 candidate 即为主要元素，否则 candidate 可能为数组中的任意一个元素。
    作者：LeetCode-Solution
    链接：https://leetcode-cn.com/problems/find-majority-element-lcci/solution/zhu-yao-yuan-su-by-leetcode-solution-xr1p/
    来源：力扣（LeetCode）
    * */

}
