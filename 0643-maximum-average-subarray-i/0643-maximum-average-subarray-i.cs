public class Solution {
    public double FindMaxAverage(int[] nums, int k) {
        int l = 0;
        double max_avg = double.MinValue;
        double window_sum = 0;
        double window_avg = 0;
        for (int r = 0; r < nums.Length; r++)
        {
            window_sum += nums[r];
            window_avg = window_sum / (r - l + 1.0);
            if (k == r - l + 1)
            {
                max_avg = Math.Max(max_avg, window_avg);
                window_sum -= nums[l];
                l++;
            }
        }
        return max_avg;
    }
}