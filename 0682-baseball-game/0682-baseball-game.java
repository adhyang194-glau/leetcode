class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String i : operations){
            if(i.equals("C")){
                st.pop();
            }
            else if(i.equals("D")){
                st.push(st.peek() * 2);
            }
            else if(i.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum = 0;
        for(int x : st){
            sum += x;
        }
        return sum;
    }
}