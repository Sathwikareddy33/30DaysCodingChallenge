class Solution {
    public int compress(char[] chars) {
     int in=0;
     int i=0;
     while(i<chars.length){
        char current=chars[i];
        int c=0;
        while(i<chars.length&&chars[i]==current){
            i++;
            c++;
        }
        chars[in++]=current;
        if(c>1){
            for(char ch:Integer.toString(c).toCharArray()){
                chars[in++]=ch;
            }
        }
     }   
     return in;
    }
}