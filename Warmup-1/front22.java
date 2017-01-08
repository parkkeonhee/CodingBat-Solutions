
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p183592
 * Completed: January 2, 2017
 */

public String front22(String str) {
    StringBuilder word = new StringBuilder();

    if(str.length() > 2){
        String letters = str.substring(0, 2);
        str = letters + str + letters;
    } else if (str.length() <= 2){
        word.append(str).append(str).append(str);
        str = word.toString();
    }
    return str;
}
