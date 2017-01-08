
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p116624
 * Completed: January 1, 2017
 */

public int diff21(int n) {
    if(n > 21){
        return 2*(Math.abs(21-n));
    }
    return (Math.abs(21-n));
}
