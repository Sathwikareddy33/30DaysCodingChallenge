class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet s=new HashSet<>();
        for(int num:nums){
            if(s.contains(num)){
                return true;
            
            }s.add(num);
        }
        return false;
    }
}