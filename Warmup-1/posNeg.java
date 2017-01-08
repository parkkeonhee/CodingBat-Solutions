
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p159227
 * Completed: January 1, 2017
 */

public boolean posNeg(int a, int b, boolean negative) {
    if(negative){
        if(a < 0 && b < 0){
            return true;
        }
        else{
            return false;
        }
    }

    if((a < 0 && b >= 0) || (a >= 0 && b < 0)){
        return true;
    }
    return false;
}
