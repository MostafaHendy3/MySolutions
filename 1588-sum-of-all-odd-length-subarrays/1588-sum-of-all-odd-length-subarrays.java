class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sumAll =0;
        int len =arr.length;
        int[] prefixsum = new int[len];
        prefixsum[0] = arr[0];
        //prefix array
        for (int i = 1; i < len; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }

        for(int i =0;i<len;i++){
            for(int j =i;j<len;j+=2){
                    if(i==0){
                        sumAll +=prefixsum[j];
                    }else{
                        sumAll +=prefixsum[j] -prefixsum[i-1];
                    }
            }
        }

        return sumAll; 
    }
}