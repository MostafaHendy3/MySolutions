class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         Stack<Integer> sand = new Stack<>();
        for (int i =sandwiches.length-1;i>=0;i--) {
            sand.push(sandwiches[i]);
        }
        Queue<Integer> student = new LinkedList<>();
        int ones=0;
        int zeros=0;
        for (int i : students) {
           if(i==1){
               ones++;
           }else{
               zeros++;
           }
            student.offer(i);
        }
        while(!student.isEmpty()){
            if((zeros==0 && sand.peek()==0)||(ones ==0 && sand.peek()==1 )){
                break;
            }
            if(sand.peek().equals(student.peek())){
                if(sand.peek()==1) ones --;
                if(sand.peek()==0) zeros --;
                sand.pop();
                student.remove();
            }else{
                int head = student.poll();
                student.add(head);
            }
        }
        return ones+zeros;
    }
}