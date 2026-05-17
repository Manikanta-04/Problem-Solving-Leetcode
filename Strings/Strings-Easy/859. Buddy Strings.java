class Solution {
    public boolean buddyStrings(String s, String goal) {
       int n=s.length(),m=goal.length();
       if(n!=m) return false;
       char[] arr=s.toCharArray();
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            if(new String(arr).equals(goal)) return true;
            else{
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;                
            }
        }
       }
       return false; 
    }
}