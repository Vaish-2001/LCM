class Least_count_num
 {
  //the LCM of any two is the value that is evenly divisible by the two given numbers. 
  public static void main(String[]args)
   {
    int n1=2;
    int n2=25;
    int largest=(n1>n2)?(n1):(n2);
   while(true)
    {
     if(largest%n1==0&&largest%n2==0)
     {
      System.out.println("lcm="+largest);
      break;
     }
      largest++;
    }
  }
 }//285