import java.util.*;

public class Prac_5 {
    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        System.out.println("Menu: ");
        String app[]={"Motor","Fan","Tube","Wires","others"};
        int code[]={1,2,3,4,5};
        int price[]={100,200,300,400,500};
        float rs,amt;
        for(int i=0;i<5;i++)
        {
            System.out.println(code[i]+". "+app[i]);
        }
          System.out.println("Enter your choice: ");
        int ch= js.nextInt();
        switch(ch)
        {
            case 1:
            rs=(price[0]*8)/100;
            amt=(price[0]+rs);
            System.out.println("The total amount of motor is "+amt);
            break;
            
            case 2:
            rs=(price[1]*12)/100;
            amt=(price[1]+rs);
            System.out.println("The total amount of fan is "+amt);
            break;

            case 3:
            rs=(price[2]*5)/100;
            amt=(price[2]+rs);
            System.out.println("The total amount of tube is "+amt);
            break;

            case 4:
            rs=(price[3]*7.5f)/100;
            amt=(price[3]+rs);
            System.out.println("The total amount of wire is "+amt);
            break;

            case 5:
            rs=(price[4]*3)/100;
            amt=(price[4]+rs);
            System.out.println("The total amount of others is "+amt);
            break;

            default:
            System.out.println("Invalid choice...");

        }
        System.out.println("This practical is made by 23CS096-JAINI SOLANKI ");

    }
}
