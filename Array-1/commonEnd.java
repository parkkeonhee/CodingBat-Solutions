
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p191991
 * Completed: January 4, 2017
 */

public boolean commonEnd(int[] a, int[] b) {
    if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
        return true;
    }
    return false;
}
