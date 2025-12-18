1import java.util.Arrays;
2
3class Solution {
4    public String largestNumber(int[] nums) {
5        String[] arr = new String[nums.length];
6        for (int i = 0; i < nums.length; i++) {
7            arr[i] = String.valueOf(nums[i]);
8        }
9        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
10        StringBuilder sb = new StringBuilder();
11        for (String s : arr) {
12            sb.append(s);
13        }
14        while (sb.length() > 1 && sb.charAt(0) == '0') {
15            sb.deleteCharAt(0);
16        }
17        return sb.toString();
18    }
19}