
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p125268
 * Completed: January 2, 2017
 */

public String endUp(String str) {
    if(str.length() >= 3){
        str = str.substring(0, str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
    } else if (str.length() < 3){
        str = str.toUpperCase();
    }
    return str;
}
