public class FibPrint
{
public static void main(String arg[])
 {
  int a=0,b=1,c;
  int num=Integer.parseInt(arg[0]);
  System.out.print("The fibonacci series of "+num+" terms are ");
  for(int i=0;i<num;i++)
   {
     if(i<=1)
       c=i;
     else
      c=a+b;
      a=b;
      b=c;
   System.out.print(" "+c);
   }
 }
}
