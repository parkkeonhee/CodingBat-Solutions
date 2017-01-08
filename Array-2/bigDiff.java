
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p196640
 * Completed: January 7, 2017
 */

 public int bigDiff(int[] nums) {
   int diff = 0;
   int max = nums[0];
   int min = nums[0];
   for(int i = 0; i < nums.length - 1; i++){
     int tempMax = Math.max(nums[i], nums[i+1]);
     if(tempMax >= max){
       max = tempMax;
     }

     int tempMin = Math.min(nums[i], nums[i+1]);
     if(tempMin <= min){
       min = tempMin;
     }
     if(i == nums.length - 2){
       diff = max - min;
     }
   }
   return diff;
 }
