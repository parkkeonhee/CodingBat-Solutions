
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p136585
 * Completed: January 7, 2017
 */

 public int centeredAverage(int[] nums) {
   int max = nums[0];
   int min = nums[0];
   for(int i : nums){
     if(max < i){
       max = i;
     }

     if(min > i){
       min = i;
     }
   }

   int sum = 0;
   int counter = 0;
   for(int i : nums){
     sum += i;
     counter++;
   }
   sum = sum - (max + min);
   counter -= 2;
   int center = sum / counter;
   return center;
 }
