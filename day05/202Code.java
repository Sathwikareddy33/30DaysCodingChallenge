class Solution {
    private int getNext(int n) {
        int s=0;
        while(n>0){
            int digit=n%10;
            s=s+(digit*digit);
            n/=10;
        }
        return s;
    }
    public boolean isHappy(int n){
        HashSet<Integer>s=new HashSet<>();
        while(n!=1&&!s.contains(n)){
            s.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}
