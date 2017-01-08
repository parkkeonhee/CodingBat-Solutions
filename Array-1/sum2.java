
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p190968
 * Completed: January 4, 2017
 */

public int sum2(int[] nums) {
    int sum = 0;

    if(nums.length >= 2){
        for(int i = 0; i < 2; i++){
            sum += nums[i];
        }
        return sum;
    } else if(nums.length == 1){
        return nums[0];
    }
    return 0;
}
