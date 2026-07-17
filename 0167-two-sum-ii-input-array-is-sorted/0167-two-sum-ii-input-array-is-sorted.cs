public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        
        for(int i = 0; i<numbers.Length ;i++){
            int r = numbers.Length-1;
            int l = i+1;
            int mid = l + (r-l)/2;
            while(l<=r){
                mid = l + (r-l)/2;
                if(numbers[mid] < target - numbers[i]){
                    l = mid+1;
                }else if(numbers[mid] > target - numbers[i]){
                    r = mid -1;
                }else if(numbers[mid] == target - numbers[i]){
                    return new int[] { i + 1, mid + 1 };
                }
            }
        }
         return new int[2]{0 ,0};
        
    }
}