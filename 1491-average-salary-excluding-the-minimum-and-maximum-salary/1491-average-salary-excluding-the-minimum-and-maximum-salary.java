class Solution {
    public double average(int[] salary) {
        int sum = Arrays.stream(salary).sum()- Arrays.stream(salary).max().getAsInt()- Arrays.stream(salary).min().getAsInt();
        return sum*1.0/(salary.length-2);
    }
}