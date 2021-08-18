class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos]<0){
                res.add(pos+1);
            }
            nums[pos] = -nums[pos];
        }
        return res;
    }
}