class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int o=x;
        int r=0;
        while(x!=0){
            int d=x%10;
            if(r>(Integer.MAX_VALUE-d)/10)
            return false;
            r=r*10+d;
            x/=10;
        }
        return o==r;
        
    }
}