Class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L'c,50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int v = m.get(s.charAt(i));
            if(i+1<s.length() && v<m.get(s.charAt(i+1))){
                sum=sum-v;
            }else{
                sum=sum+v;
            }
        }
        return sum;
        
    }
}