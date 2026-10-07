class find_duplicate_287
{
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        do
        {
               slow=nums[slow];         //slow +1
               fast=nums[nums[fast]];   //fast +2 

        }while(slow!=fast);



             slow=nums[0]; //intialize 0 ind before while

        while(slow!=fast)
        {

            slow=nums[slow];  //slow +1
            fast=nums[fast];  //fast +1
        }
        return slow;  //fast madhi pn same value aahe
    }
}
/*  ex.[1,3,4,2,2]  

    :use slow fast approach 

step 1: intialize slow and fast 0th value

step 2:  increse slow by 1 and fast by 2 slow!=fast 

step 3: slow intialize 0 slow!=fast 
Now slow and fast increse both by 1

time compexity 0(n)
space complexity 0(1)*/
