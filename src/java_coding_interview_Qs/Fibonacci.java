package java_coding_interview_Qs;

public class Fibonacci {
    public static void main(String[] args) {

        // n is nth term, firstnum is the first term, secondnum is the second term
        int n = 20, firstnum = 1, secondnum = 1;
        System.out.println("Fibonacci number\n" + n + " times :");
        //iterate from 1st term to nth term
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstnum + ", ");
            //nextnum is the next term
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }
}

/*
Fibonacci number
an integer in the infinite sequence
1, 1, 2, 3, 5, 8, 13, … of which the first two terms are 1 and 1
and each succeeding term is the sum of the two immediately preceding

Given the number of ending term
Display fibonacci numbers
 */
