class Solution {
    public String reverseWords(String s) {
     StringBuilder sb =new StringBuilder(s);
     sb.reverse();
     String rs=sb.toString();
     int n=rs.length();
     String res="";
     for(int i=0;i<n;i++){
        String word="";
        while(i<n && rs.charAt(i)!=' '){
            word+=rs.charAt(i);
            i++;
        }
        StringBuilder k =new StringBuilder(word);
        k.reverse();
        if(word.length()>0){
        res+=" "+k.toString();
        }
     }
     return res.trim(); 
    }
}