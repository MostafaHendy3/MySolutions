class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        map<int, int> count;
        for (int num : nums) {
            count[num]++;
        }
        int k = 0;
        for (auto num : count) {
            if (num.second == 1) {
                nums[k] = num.first;
                k++;
            } else if (num.second >= 2) {
                nums[k] = num.first;
                k++;
                nums[k] = num.first;
                k++;
            }
        }
        return k;
    }
};