
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p194667
 * Completed: January 2, 2017
 */

int countXX(String str) {
    int counter = 0;

    for(int i = 0; i < str.length()-1; i++){
        if(str.substring(i, i+2).equalsIgnoreCase("xx")){
            counter++;
        }
    }
    return counter;
}
