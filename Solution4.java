import java.util.*;
import java.io.*;

class Solution4{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            
            // Generate and print the series for this query
            for (int j = 0; j < n; j++) {
                sum += b * (1 << j);  // Calculate the next term in the series
                System.out.print(sum + " ");
            }
            System.out.println();  // Move to the next line after each series
        
        }
        in.close();
    }
}