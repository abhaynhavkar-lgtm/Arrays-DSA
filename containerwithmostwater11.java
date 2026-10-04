class containerwithmostwater11 {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxwater=0;
        while(lp<rp)
        {
          //calculate area 
          int width=rp-lp;
          int ht=Math.min(height[lp],height[rp]);
          int area=width*ht;
          maxwater=Math.max(area,maxwater);

          //update pointer      
          if(height[lp]<height[rp]) //actual value compare karto
          {
            lp++;
          }  
          else
          {
            rp--;
          }
        }
        return maxwater;
    }
}
/*
logic:  2 pointer approach
Aplyala phakt 2 Bar select karayche Tya 2 Bar madhe kiti pani yein te Badhaych
 Saglyat jast pani kontya 2  baar madhe yein tyancha area kadhaycha 

ht=min(lp ht,rp ht)
width=rp-lp
currwater=ht*width

time compexity o(n)
