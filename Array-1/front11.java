
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p128270
 * Completed: January 7, 2017
 */

 public int[] front11(int[] a, int[] b) {
   int[] array;


   if(a.length == 0 && b.length == 0){
     array = new int[0];
     return array;
   } else if(a.length == 0){
     array = new int[1];
     array[0] = b[0];
   } else if(b.length == 0){
     array = new int[1];
     array[0] = a[0];
   } else{
     array = new int[2];
     array[0] = a[0];
     array[1] = b[0];
   }

   return array;
 }
