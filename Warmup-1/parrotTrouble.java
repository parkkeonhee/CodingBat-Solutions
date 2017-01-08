
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p140449
 * Completed: January 1, 2017
 */

public boolean parrotTrouble(boolean talking, int hour) {
    return talking && (hour < 7 || hour > 20);
}
