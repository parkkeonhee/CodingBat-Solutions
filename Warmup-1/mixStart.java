
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p151713
 * Completed: January 2, 2017
 */

public boolean mixStart(String str) {
    String letters = "";

    if(str.length() >= 3){
        letters = str.substring(1, 3);
    }

    if(letters.equalsIgnoreCase("ix")){
        return true;
    }
    return false;
}
