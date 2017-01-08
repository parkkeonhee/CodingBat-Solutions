
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p145365
 * Completed: January 2, 2017
 */

 public boolean double23(int[] nums) {
   int twos = 0;
   int threes = 0;
   boolean match = false;

   for(int i = 0; i < nums.length; i++){
     if(nums[i] == 2){
       twos++;
       if(twos >= 2){
         match = true;
       }
     } else if(nums[i] == 3){
       threes++;
       if(threes >= 2){
         match = true;
       }
     }
   }

   if(match){
     return true;
   }
   return false;
 }
