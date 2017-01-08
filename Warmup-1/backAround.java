
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p161642
 * Completed: January 2, 2017
 */

public String backAround(String str) {
    String letter = String.valueOf(str.charAt(str.length()-1));
    return letter + str + letter;
}
