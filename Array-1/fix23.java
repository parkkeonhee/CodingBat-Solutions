
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p120347
 * Completed: January 2, 2017
 */

 public int[] fix23(int[] nums) {
   for(int i = 0; i < nums.length - 1; i++){
     if(nums[i] == 2 && nums[i+1] == 3){
       nums[i+1] = 0;
     }
   }
   return nums;
 }
