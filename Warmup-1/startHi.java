
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p191022
 * Completed: January 2, 2017
 */

public boolean startHi(String str) {
    if(str.length() >= 2 && str.substring(0,2).equalsIgnoreCase("hi")){
        return true;
    }
    return false;
}
