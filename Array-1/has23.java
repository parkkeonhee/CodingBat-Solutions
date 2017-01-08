
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p171022
 * Completed: January 4, 2017
 */

public boolean has23(int[] nums) {
    for(int i = 0; i < 2; i++){
        if(nums[i] == 2 || nums[i] == 3){
            return true;
        }
    }

    return false;
}
