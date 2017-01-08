
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p101230
 * Completed: January 4, 2017
 */

public int[] makeEnds(int[] nums) {
    int[] makeEnds = new int[2];

    makeEnds[0] = nums[0];
    makeEnds[1] = nums[nums.length - 1];

    return makeEnds;
}
