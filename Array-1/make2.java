
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p143461
 * Completed: January 7, 2017
 */

 public int[] make2(int[] a, int[] b) {
   int[] array = new int[2];

   if(a.length == 0){
     array[0] = b[0];
     array[1] = b[1];
   }

   if(a.length == 1){
     array[0] = a[0];
     array[1] = b[0];
   }

   if(a.length >= 2){
     for(int i = 0; i < 2; i++){
       array[i] = a[i];
     }
   }
   
   return array;
 }
