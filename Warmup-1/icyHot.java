
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p192082
 * Completed: January 2, 2017
 */

public boolean icyHot(int temp1, int temp2) {
    if((temp1 < 0 && temp2 > 100) || temp2 < 0 && temp1 > 100){
        return true;
    }
    return false;
}
