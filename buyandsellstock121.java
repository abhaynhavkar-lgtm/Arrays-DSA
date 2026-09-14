import java.util.*;
class buyandsellstock121 {
    public int maxProfit(int[] prices) {
        int maxprices=0;
        int buyprice=Integer.MAX_VALUE,profit;  //max ch de min del tr ans wrong yet

 //int buyprice=0,profit; he as ghetl tr wrong output yein start ch 7pasun hoin max 7 store hoin 

 //tya peksha koni lahan pn aal tari store 7 ch rahil

 //buyprice max de karan tyapeksha pudhchi value lahan rahin jas ki 7.
        for(int i=0;i<prices.length;i++)
        {
            if(buypric<prices[i])  
            {
              profit=prices[i]-buyprice;
              maxprices=Math.max(profit,maxprices);
            }
            else
            {
                buyprice=prices[i];
            }
        }
        return maxprices;
    }
}
/* Question:- Stack price la Buy karayh sarvat kami day la and sell karaych savat jast day la jastit jast profit shodhaycha.

Logic:-  1) Buying and selling day diffent different pahije
         2) Selling day future pahije
         3) Loss zalyvr return 0. ex.(5,4,3,2,1) loss Hoin.

Step 1: 2 variable maxpric and Buyprice=int.max because day 1 la buy karaycha aahe.
Step 2: for loop 0 to n
Step 3: buyprice < currentprice then find profit and store maxprice variable.

step 4: otherwise (else) current price la Buy karun ghyayach.. Pan profit nahi find karyach because loss Hoin.