class Solution {
    public boolean lemonadeChange(int[] bills) {
      if(bills[0]!=5) return false;
      int fives=0,tens=0;
      for(int i : bills){
        if(i==5) fives++;
        else if(i==10){
            if(fives>0){
                fives--;
                tens++;
            }
            else return false;
        }
        else{
                if(tens>0 && fives >0 ){
                    tens--;
                    fives--;
                }
                else if( tens==0 && fives>=3) fives-=3;
                else return false;
        }
      }
      return true;
    }
}