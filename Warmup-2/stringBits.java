
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p165666
 * Completed: January 2, 2017
 */

public String stringBits(String str) {
    StringBuilder message = new StringBuilder();

    for(int i = 0; i < str.length(); i++){
        if(i % 2 == 0){
            message.append(str.charAt(i));
        }
    }

    return message.toString();
}
