
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p185139
 * Completed: January 4, 2017
 */

public int[] rotateLeft3(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[1];
    nums[1] = nums[2];
    nums[2] = temp;

    return nums;
}
