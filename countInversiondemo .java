//COUNT INVERSION
class countInversiondemo    
{
    public static int countInversion(int arr[])
    {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
      }
    public static void main(String args[])
    {
        countInversiondemo s1=new countInversiondemo();
        int arr[]={5,2,6,1};
        System.out.println(s1.countInversion(arr));
    }
}
/*mens motha number pahile aani chota number nantar tyancha count
(5,2)
(5,1)
(2,1)
(6,1)
count=4*/