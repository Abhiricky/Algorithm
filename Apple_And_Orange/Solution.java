import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int apple_on_roof = 0;
        int orange_on_roof = 0;
        int[] apples_distance = new int[apples.length];
        int[] oranges_distance = new int[oranges.length];
        for(int i = 0; i < apples.length; i++)
        {
            apples_distance[i] = a + apples[i];
            if(apples_distance[i] >= s && apples_distance[i] <= t)
                apple_on_roof++;
        }
        for(int j = 0; j < oranges.length; j++)
        {
            oranges_distance[j] = b + oranges[j];
            if(oranges_distance[j] >= s && oranges_distance[j] <= t)
                orange_on_roof++;
        }
        System.out.println(apple_on_roof);
        System.out.println(orange_on_roof);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}

