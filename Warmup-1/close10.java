
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p172021
 * Completed: January 2, 2017
 */

public int close10(int a, int b) {
    if(Math.abs(10 - a) < Math.abs(10 - b)){
        return a;
    } else if(Math.abs(10 - a) > Math.abs(10 - b)){
        return b;
    } else {
        return 0;
    }
}
