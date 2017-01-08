
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p123384
 * Completed: January 2, 2017
 */

public String frontBack(String str) {
    if(str.length() > 1){
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        str = last + str.substring(1, str.length()-1) + first;
    }
    return str;
}
