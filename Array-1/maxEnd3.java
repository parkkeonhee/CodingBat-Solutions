
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p146256
 * Completed: January 4, 2017
 */

public int[] maxEnd3(int[] nums) {
    int largest = -1;

    if(nums[0] >= nums[nums.length - 1]){
        largest = nums[0];
    } else if(nums[nums.length - 1] >= nums[0]){
        largest = nums[nums.length - 1];
    }

    for(int i = 0; i < nums.length; i++){
        nums[i] = largest;
    }

    return nums;
}
