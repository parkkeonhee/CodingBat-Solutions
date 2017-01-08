
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p185176
 * Completed: January 2, 2017
 */

 public int maxTriple(int[] nums) {
   if(nums.length == 1){
     return nums[0];
   }

   int first = nums[0];
   int middle = nums[nums.length / 2];
   int last = nums[nums.length - 1];

   if(first > middle && first > last){
     return first;
   } else if(middle > first && middle > last){
     return middle;
   }
   return last;
 }
