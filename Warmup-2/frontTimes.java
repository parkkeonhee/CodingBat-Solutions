
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p101475
 * Completed: January 2, 2017
 */

public String frontTimes(String str, int n) {
    StringBuilder message = new StringBuilder();

    if(str.length() >= 3){
        for(int i = 0; i < n; i++){
            message.append(str.substring(0,3));
        }
    } else if(str.length() < 3){
        for(int i = 0; i < n; i++){
            message.append(str.substring(0));
        }
    }

    return message.toString();
}
