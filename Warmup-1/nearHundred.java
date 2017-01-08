
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p184004
 * Completed: January 1, 2017
 */

public boolean nearHundred(int n) {
    return (Math.abs((100 - n)) <= 10) || (Math.abs((200 - n)) <= 10);
}
