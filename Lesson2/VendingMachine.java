/* 1 Quaters= 25 cents
   1 Dimes=10 cents
   1 Nickel=5 cents
   1 Penny=1 cent
 */
/*Vending Machine accept only 1 dollar coins.so 1 DOLLAR=100 cents*/
import java.util.*;
public class VendingMachine {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
int amount, quarters, dimes, nickels, pennies,exchange;
System.out.println("Enter the price of the(from 25 cents to a dollar, in 5-cent increments): ");
 amount=input.nextInt();
 
 exchange= 100-amount;
 
 System.out.println("Amout in Return:"+exchange+"cents");
 
 quarters=exchange/25;
 exchange=exchange%25;
 
 dimes=exchange/10;
 exchange=exchange%10;
 
 nickels=exchange/5;
 exchange=exchange%5;
 
 pennies=exchange;
 
 System.out.println("Quarters:"+quarters+" Dimes:"+dimes+" Nickels:"+nickels+" Pennies:"+pennies);
    }

}
 