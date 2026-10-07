import java.util.*;
class  kadansalgorithm{
    public static int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;  //jr sarv negrative astil tr Integer.MIN_VALUE karan negetive sathi -1 pahije 0 nahi -1-2-3-4
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
     sum=sum+nums[i];
     maxsum=Math.max(sum,maxsum);    //ata paryant chi sarvat mothi sum thevto
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;
    }
}
//
/*-1,-2,-3,-4 ans =-1
 ex.2= 2 -5 4 3        Logic: aata paryant chi sum kadhne ek varable madhe thevne jar sum 
 sum =7                        Negative asel tr 0 set karne aani pudchi pararat kadhne
   
   2+(-5)=-3 aata aapla sum -3 aahe
   -3+4 =1 worng aahe karan next 4 aahe 
   mhanun phakt 4 ghetla ans 4 anai next 3 4+3=7
   ans 7:*/