
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p142270
 * Completed: January 2, 2017
 */

public String stringTimes(String str, int n) {
    StringBuilder message = new StringBuilder();
    for(int i = 0; i< n; i++){
        message.append(str);
    }
    return message.toString();
}
