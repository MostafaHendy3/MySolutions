class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string shortest = strs[0];
    for (int i = 1; i < strs.size(); i++) {
        if (strs[i].length() < shortest.length()) {
            shortest = strs[i];
        }
    }
   int left = 0, right = (int)shortest.length() - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        string prefix = shortest.substr(0, mid + 1);
        bool isCommonPrefix = true;
        for (int i = 0; i < strs.size(); i++) {
            if (strs[i].substr(0, mid + 1) != prefix) {
                isCommonPrefix = false;
                break;
            }
        }
        if (isCommonPrefix) {
            left = mid + 1;   
        } else {
            right = mid - 1;      
        }
    }
    return shortest.substr(0, right + 1);
    }
};