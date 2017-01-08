
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p199519
 * Completed: January 7, 2017
 */

 public int[] makeMiddle(int[] nums) {
   int[] middleArray = new int[2];
   middleArray[0] = nums[(nums.length / 2) - 1];
   middleArray[1] = nums[nums.length / 2];

   return middleArray;
 }
