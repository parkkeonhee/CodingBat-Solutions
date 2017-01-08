
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p185685
 * Completed: January 4, 2017
 */

public boolean firstLast6(int[] nums) {
    if(nums[0] == 6 || nums[nums.length-1] == 6){
        return true;
    }
    return false;
}
