
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p142455
 * Completed: January 7, 2017
 */

 public int[] frontPiece(int[] nums) {
   int[] array;

   if(nums.length == 0){
     return nums;
   } else if(nums.length == 1){
     array = new int[1];
     array[0] = nums[0];
     return array;
   }

   array = new int[2];
   array[0] = nums[0];
   array[1] = nums[1];

   return array;
 }
