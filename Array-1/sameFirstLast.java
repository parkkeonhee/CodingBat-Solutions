
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p118976
 * Completed: January 4, 2017
 */

public boolean sameFirstLast(int[] nums) {
    if(nums.length >= 1 && nums[0] == nums[nums.length - 1]){
        return true;
    }
    return false;
}
