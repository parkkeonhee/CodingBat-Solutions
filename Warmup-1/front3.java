
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p136351
 * Completed: January 2, 2017
 */

public String front3(String str) {
    if(str.length() > 3){
        str = str.substring(0,3);
    }
    return str.concat(str.concat(str));
}
