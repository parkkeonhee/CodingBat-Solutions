
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p109660
 * Completed: January 2, 2017
 */

 public int start1(int[] a, int[] b) {
   int ones = 0;
   if(a.length != 0 && a[0] == 1){
     ones++;
   }
   if(b.length != 0 && b[0] == 1){
     ones++;
   }
   
   return ones;
 }
