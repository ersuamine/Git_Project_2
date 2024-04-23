package java_coding_interview_Qs;

import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "ABNJALAJIA";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        StringBuilder result = new StringBuilder();
        for (char each : chars) {
            int count = 0;
            for (char s : chars) {
                if (each == s) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(each + " ");
            }

        }
    }
}
