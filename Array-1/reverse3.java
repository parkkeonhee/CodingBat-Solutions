
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p112409
 * Completed: January 4, 2017
 */

public int[] reverse3(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;

    return nums;
}
