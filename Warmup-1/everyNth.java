
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p196441
 * Completed: January 2, 2017
 */

public String everyNth(String str, int n) {
    StringBuilder letters = new StringBuilder();

    for(int i = 0; i < str.length(); i+=n){
        letters.append(str.charAt(i));
    }
    return letters.toString();
}
