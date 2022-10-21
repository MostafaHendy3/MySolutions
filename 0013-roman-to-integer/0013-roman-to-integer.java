class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'I') {
                sum++;
            }
            if (ch[i] == 'V') {
                if (ch[i==0?i:i-1] == 'I') {
                    sum -= 1;
                    sum += 4;
                }else {
                    sum +=5;
                }
            }
            if (ch[i] == 'X') {
                if (ch[i==0?i:i-1] == 'I') {
                    sum -= 1;
                    sum += 9;
                }else{
                    sum +=10;
                }
            }
            if (ch[i] == 'L') {
                if (ch[i==0?i:i-1] == 'X') {
                    sum -= 10;
                    sum += 40;
                }else{
                    sum +=50;
                }
            }
            if (ch[i] == 'C') {
                if (ch[i==0?i:i-1] == 'X') {
                    sum -= 10;
                    sum += 90;
                }else{
                    sum +=100;
                }
            }
            if (ch[i] == 'D') {
                if (ch[i==0?i:i-1] == 'C') {
                    sum -= 100;
                    sum += 400;
                }else{
                    sum +=500;}
            }
            if (ch[i] == 'M') {
                if (ch[i==0?i:i-1] == 'C') {
                    sum -= 100;
                    sum += 900;
                }else{
                    sum +=1000;}
            }

        }
        return sum;
    }
}