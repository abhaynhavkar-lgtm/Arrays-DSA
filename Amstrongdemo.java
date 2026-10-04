//program of Amstrong number 
class Amstrongdemo
{
  public static void main(String args[])
  {
    int no=151;
    int last,sum=0,temp;
   temp=no;
  while(no>0) 
  {
   last=no%10;
   sum=sum+(last*last*last);
    no=no/10;
  }
  if(sum==temp)
 {
  System.out.println("Amstrong Number");
 }
 else
 {
   System.out.println("not Amstrong Number");
  }
 }
}