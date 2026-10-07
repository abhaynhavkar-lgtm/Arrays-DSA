class findmissingandrepetedval{
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;

        int count[]=new int[total+1]; //frequency find karaysathi size +1 keli 1 aal count[1]++ = 1 0 nahi 1 position pahije mhanun parat count[1]++ =2
                                     // 0 1 2 3 4  0 consider karat nahi aapn
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                count[grid[i][j]]++;   //ind 0 1  2  3  4
                                       //val    1 2  1  0

            }
        }

            int repeted=0;
            int missing=0;

            for(int i=1;i<=total;i++)
            {
                if(count[i]==2)
                {
                    repeted=i;
                }
                if(count[i]==0)   //missing mens tya index vr 0 value assign aahe
                {
                    missing=i;
                }
            }
            int ans[]={repeted,missing};
            return ans; 
    }
}
/*count[grid[i][j]]++; hi step 2d array la single   
  array madhi convert karte aani pratek index la 1 value takte
              aani  jithe element repete aala te tya index la 2 value hote.
              aani jithe missing aahe tithe 0 value takte 0 chya pudhche phakt.time comp=0(n^2) ,space comp=0(n^2)
               Ex 1,3
                  2 2
                  
                  0 1 2 3 4
                    1 2 1 0
                     ek tip jar 2 by 2 madhi fakt 1 to 4 number pahije astat 8,9 ase chalnar nahi karan size 5 aahe leetcode number 2965
                     
step 1: count array banavla 1d (n*n)+1 size cha
step 2 frequency find keli grid chi
step 3: 1 loop lav 1 to n paryant 
        i) count[i]==2 mhanje repeted
        ii)count[i]==0 mhanje missing */ 