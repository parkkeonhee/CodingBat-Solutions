
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p100905
 * Completed: January 2, 2017
 */

public String delDel(String str) {
    String findLetters = "";

    if(str.length() >=4){
        findLetters = str.substring(1,4);
    }

    if(findLetters.equalsIgnoreCase("del")){
        str = str.substring(0,1) + str.substring(4,str.length());
    }
    return str;
}
