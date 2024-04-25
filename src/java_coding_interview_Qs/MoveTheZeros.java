package java_coding_interview_Qs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 0, 5, 0, 1, 0));

        int numOfZero = Collections.frequency(list, 0);
        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < numOfZero; i++) {
            list.add(0);
        }

        System.out.println(list);

    }


}

 /*
9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */
