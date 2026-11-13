class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max =Integer.MIN_VALUE;
        int ansI=-1;
        int ansJ=-1;
        int n=nums.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&nums[i]+nums[j]==target&&nums[i] > nums[j]){
                  int   product=nums[i]*nums[j];
                     if(product > max) {
                    max = product;
                    ansI = i;
                    ansJ = j;
                }
                }
            }
          
        }
           return new int[]{ansI, ansJ};
    }
}