import java.util.*;
class Task2{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Number Guessing Game");
  int min = 1;  
  int max = 100; 
  int count=100;
int num = (int)(Math.random()*(max-min+1)+min);
System.out.println("Guess the number in 5 attempts");  
for(int i=0;i<5;i++)
{
 System.out.print("Enter the number:");
 int a=sc.nextInt();
if(num==a)
{
 System.out.println("Correct");
 break;
}
else if(a<num){
System.out.println("Number is lower than guessing number");
count=count-10;
 }
else if(a>num)
{
System.out.println("Number is higher than guessing number");
count=count-10;
}
}
System.out.println("Random number is " +num);
System.out.println("Score=" +count);
}
}
