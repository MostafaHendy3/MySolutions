1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4         for (int i = 0; i < nums.size(); i++) {
5            for (int j = i + 1; j < nums.size(); j++) {
6                if (nums[j] == target - nums[i]) {
7                    return {i, j};
8                }
9            }
10        }
11        // Return an empty vector if no solution is found
12        return {};
13    }
14};