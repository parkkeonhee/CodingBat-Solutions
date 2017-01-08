
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p137188
 * Completed: January 7, 2017
 */

 public int[] makeLast(int[] nums) {
   int[] newArray = new int[nums.length * 2];
   newArray[newArray.length - 1] = nums[nums.length - 1];
   return newArray;
 }
