//Banking.java
package sbi;
import java.util.Scanner;
import bank.InvalidDepositException;
import bank.InsuffFundsException;
import bank.InvalidWithDrawException;
public class Banking
{
 double bal = 0;
 Scanner s = new Scanner(System.in);
 public Banking()
 {
  bal = 500;
 }
 public void deposit() throws NumberFormatException,InvalidDepositException
 {
  System.out.println("Enter the amount to deposit:");
  double damt = Double.parseDouble(s.nextLine());
  if (damt<=0)
  {
   InvalidDepositException ide = new InvalidDepositException();
   throw ide;
  }
  else
  {
   bal = bal+damt;
   System.out.println("Your balance after deposit is:"+bal);
  }
 }//deposit()
 public void WithDraw() throws NumberFormatException,InvalidWithDrawException,InsuffFundsException
 {
  System.out.println("Enter the amount to Withdraw:");
  double wamt = Double.parseDouble(s.nextLine());
  if (wamt<=0)
  {
   InvalidWithDrawException iwe = new InvalidWithDrawException();
   throw iwe;
  }
  else
  {
   if (wamt>bal)
   {
    InsuffFundsException ise = new InsuffFundsException();
    throw ise;
   }//if
   else
   {
    bal = bal - wamt;
    System.out.println("\n\t Take cash and enjoy!");
    System.out.println("\n\t Your available balance after withdraw is :"+bal);
   }//else
  }//else
 }//WithDraw()
 public void BalEnq()
 {
  System.out.println("\n\t Your available balance is:"+bal);
 }//BalEnq()
}//Banking -- class