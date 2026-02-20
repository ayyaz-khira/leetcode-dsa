class Solution {
    public boolean lemonadeChange(int[] bills) {
       int count5=0;
        int count10=0;
        for(int x:bills){
           if(x==5) count5++;
           if(x==10) count10++;

           x-=5;
           if(x==5){
            if(count5>=1) count5--;
            else return false;
           }
           else if(x==15){
            if(count5>=1 && count10>=1){
                count5--;
                count10--;
            }
            else if(count5>=3){
                count5-=3;
            }
            else{
                return false;
            }
           }



            
        }
           return true;
    }
}