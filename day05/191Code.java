class Solution {
    public int hammingWeight(int n) {
     int a=0;
     while(n!=0){
        n&=(n-1);
        a++;

        
     }   return a;
    }
}