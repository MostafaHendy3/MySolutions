//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		
	    while(t-- >0)
	    {
	        String inputLine[] = br.readLine().trim().split(" ");
	        
	        //taking n and sum
            int n = Integer.parseInt(inputLine[0]);
            int sum = Integer.parseInt(inputLine[1]);
            
            //calling largestNumber() function
            System.out.println(new Solution().largestNumber(n, sum));
	    }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        if (sum == 0)
        {
            if(n==1){
                return "0";
            }
        }
        if (sum > 9*n)
        {
            return("-1");
        }
        int[] result = new int[n];
        for (int i=0; i<n; i++)
        {
            if (sum >= 9)
            {
                result[i] = 9;
                sum -= 9;
            }
            else
            {
                result[i] = sum;
                sum = 0;
            }
        }
        String res="";
        for (int i=0; i<n; i++)
            res+=result[i];
        return res;
    }
}


