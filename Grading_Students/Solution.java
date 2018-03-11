import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int[] final_grade = new int[grades.length];
        for(int i = 0; i < grades.length; i++)
        {
            if(grades[i] < 38)
                final_grade[i] = grades[i];
            else
            {
                int five_multiplier = (grades[i]/5) + 1;
                int next_big_number = 5 * five_multiplier;
                if(next_big_number - grades[i] < 3)
                    final_grade[i] = next_big_number;
                else
                    final_grade[i] = grades[i];
            }
        }
        return final_grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

