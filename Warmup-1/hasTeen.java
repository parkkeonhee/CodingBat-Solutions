
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p178986
 * Completed: January 2, 2017
 */

public boolean hasTeen(int a, int b, int c) {
    if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){
        return true;
    }
    return false;
}
