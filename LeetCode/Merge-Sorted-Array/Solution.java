1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3         
4      for(int i=0;i<n;i++){
5            nums1[i+m]=nums2[i];
6        }
7        int len = nums1.length;
8        for (int i = 1; i < len; i++) {
9            int key = nums1[i];
10            int j = i - 1;
11            while (j >= 0 && key < nums1[j]) {
12                nums1[j + 1] = nums1[j];
13                --j;
14            }
15            nums1[j + 1] = key;
16        }
17    }
18}