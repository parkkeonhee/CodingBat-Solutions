
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p191914
 * Completed: January 1, 2017
 */

public String notString(String str) {
    if(str.length() >= 3 && str.substring(0,3).equals("not")){
        return str;
    }
    return "not " + str;
}
