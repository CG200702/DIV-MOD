
package dividing.and.using.mod;

import java.util.Scanner;

public class DividingAndUsingMod {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int usernumber1 = input.nextInt();
        
        System.out.println("Enter anouther number");
        int usernumber2 = input.nextInt();
        
        int dividing = usernumber1 / usernumber2;
        
        System.out.println("Number 1 divided by number 2 is  " + dividing);
        
        int MOD = usernumber1 % usernumber2;
        
        System.out.println("Number 1 MOD by number 2 is  " + MOD);

    }
    
}
