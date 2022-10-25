class Solution {
    public int mostWordsFound(String[] sentences) {
       int spaces=0;
        for(int i =0;i<sentences.length;i++){
            if(spaces < sentences[i].split("\s").length){
                spaces =sentences[i].split("\s").length;
            }
        }
        return  spaces;
    }
}