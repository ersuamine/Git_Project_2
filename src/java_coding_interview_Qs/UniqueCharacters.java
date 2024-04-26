import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "ABNJALAJIA";
        // make char array of the string for easy for loop iteration
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        //make stringbuilder object to store unique chars
        StringBuilder result = new StringBuilder();

        //iterate through each char and compare it to char list
        for (char each : chars) {
            //counter for counting the number of char match
            int count = 0;
            for (char s : chars) {
                //increment counter when there's match
                if (each == s) {
                    count++;
                }
            }
            //if counter is more than one, it means duplicate letters
            if (count > 1) {
                System.out.print(each + " ");


            } else {
                // if counter is 1, means there's only one letter matched
                // add letter to the stringbuilder object
                result.append(each);
            }
        }
        System.out.println();
        System.out.println("Unique characters");
        System.out.println(result);
    }
}