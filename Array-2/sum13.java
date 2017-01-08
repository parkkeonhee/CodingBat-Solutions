
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p127384
 * Completed: January 7, 2017
 */

 public int sum13(int[] nums) {
   int sum = 0;
   for(int i = 0; i < nums.length; i++){
     if(nums[i] == 13){
       i += 2;
     }
     if(i < nums.length){
       if(nums[i] != 13){
         sum += nums[i];
       }
     }
   }
   return sum;
 }
