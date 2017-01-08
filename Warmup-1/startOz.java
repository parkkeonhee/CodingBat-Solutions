
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p199720
 * Completed: January 2, 2017
 */

public String startOz(String str) {
    String message = "";
    if(str.length() >= 2){
        if(str.substring(0, 1).equalsIgnoreCase("o")){
            message = str.substring(0, 1);
        }
        if(str.substring(1, 2).equalsIgnoreCase("z")){
            message += str.substring(1, 2);
        }
    } else if(str.length() == 1){
        if(str.substring(0, 1).equalsIgnoreCase("o")){
            message = str.substring(0, 1);
        }
    }
    return message;
}
