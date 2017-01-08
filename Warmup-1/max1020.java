
/*
 * Author: Keon Hee Park
 * Assignment: http://codingbat.com/prob/p177372
 * Completed: January 2, 2017
 */

public int max1020(int a, int b) {
    if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
        if(a < 10 || a > 20){
            return b;
        } else if (b < 10 || b > 20){
            return a;
        } else if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)){
            return Math.max(a,b);
        }
    }
    return 0;
}
