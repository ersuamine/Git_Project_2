package java_coding_interview_Qs;

public class SwapNumbers {
    public static void main(String[] args) {
        // make int variables
        int x =5;
        int y = 7;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Swapping values");

        // add value of x and y and set it as x
        x = x + y; //12

        // swap value of y by substracting it from total value (x)
        y = x - y; // 5

        //swap value of x substracting it from total value (x)
        x = x - y; //7

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
/*
Swap values of two given variable without creating another variable
 */
