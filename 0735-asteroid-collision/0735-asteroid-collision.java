class Solution {
     public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                st.push(i);
            }
            else{
                while(!st.empty() && st.peek() > 0 && st.peek() < Math.abs(i)){
                    st.pop();
                }
                if(i < 0 && (st.empty() || st.peek() < 0)){
                    st.push(i);
                }
                else if(!st.empty() && st.peek() == Math.abs(i)){
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int j = st.size() - 1; j >= 0; j--){
            ans[j] = st.pop();
        }
        return ans;
    }
}