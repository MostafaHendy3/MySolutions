class Solution {
public:
void reverseString(vector<char>& s) {
     int begin = 0;
     int end = s.size()-1
     ;
     while (begin < end){
        
        swap(s[begin],s[end]);
        begin ++;
        end--;
        if (begin == end){
            break;
        }
    }

    }

void swap(char & x, char & y){
    char temp = x;
    x = y;
    y= temp;
}
};