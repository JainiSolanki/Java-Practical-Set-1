import java.util.*;
public class Prac_6 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    int num=s.nextInt();
    int reverse=0;
    while(num!=0)
    {
      int j=num%10;
      reverse=(reverse*10 )+ j;
      num/=10;
    }
    System.out.println("Reversed number is: " +reverse);
    System.out.println("This practical is made by 23CS096-JAINI SOLANKI ");
   } 
  

}
