
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p165701
 * Completed: January 2, 2017
 */

public boolean loneTeen(int a, int b) {
    if (a >= 13 && a <= 19){
        if(b >= 13 && b <= 19){
            return false;
        } else {
            return true;
        }
    } else if(b >= 13 && b <= 19){
        return true;
    }
    return false;
}
