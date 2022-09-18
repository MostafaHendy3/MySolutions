class Solution {
    public int findLucky(int[] arr) {
        int max =Arrays.stream(arr).max().getAsInt();
        int[] freqArray =new int[max+1];
        for(int i =0;i<arr.length;i++){
            freqArray[arr[i]]++;
        }
        for(int i=freqArray.length-1;i>0 ;i--){
            if(freqArray[i]==i){

                return i;
            }
        }
        return -1;
    }
}