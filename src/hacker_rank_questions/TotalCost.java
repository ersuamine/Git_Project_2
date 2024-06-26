package hacker_rank_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalCost {


    static class Result {

        /*
         * Complete the 'solve' function below.
         *
         * The function accepts following parameters:
         *  1. DOUBLE meal_cost
         *  2. INTEGER tip_percent
         *  3. INTEGER tax_percent
         */

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            // Write your code here
            double total = meal_cost + (meal_cost * tip_percent/100) + (meal_cost*tax_percent/100);
            System.out.println(Math.round(total));

        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);

            bufferedReader.close();
        }
    }

}
