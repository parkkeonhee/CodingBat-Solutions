
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p190570
 * Completed: January 1, 2017
 */

public String missingChar(String str, int n) {
    String one = "";
    String result = "";

    if(n != 0){
        one = str.substring(0, n);
        str = str.substring(n+1, str.length());
        result = one +str;
    } else if(n == 0){
        result = str.substring(n+1);
    }
    return result;
}
