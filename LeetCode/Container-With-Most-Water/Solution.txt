1class Solution {
2public:
3    int maxArea(vector<int>& height) {
4        int left = 0;
5        int right = height.size() - 1;
6        int max_area = 0;
7        
8        while (left < right) {
9            int width = right - left;
10            int current_height = min(height[left], height[right]);
11            int current_area = width * current_height;
12            max_area = max(max_area, current_area);
13            
14            if (height[left] < height[right]) {
15                left++;
16            } else {
17                right--;
18            }
19        }
20        
21        return max_area;
22    }
23};