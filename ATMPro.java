//ATMPro.java
import java.util.Scanner;
import bank.InvalidDepositException;
import bank.InvalidWithDrawException;
import bank.InsuffFundsException;
import sbi.Banking;
import mp.MenuOp;
class ATMPro 
{
 public static void main(String[] args) 
 {
  Banking bo = new Banking();
  while(true)
  {
  try
  {
   MenuOp m = new MenuOp();
   m.menuAtm();
   Scanner s = new Scanner(System.in);
   System.out.println("Enter your choice:");
   int op = Integer.parseInt(s.nextLine());
   switch(op)
   {
	case 1: try
	       {
		    bo.deposit();
	       }catch(NumberFormatException nfe)
	        {
		    System.out.println("Dont enter ANV(Please enter a valid integer!)");
		}catch(InvalidDepositException ide)
	        {
	            System.out.println("Please enter a valid amount to deposit!");
		}
		break;
	case 2: try
	        {
		     bo.WithDraw();
	        }catch(NumberFormatException nfe)
	         {
			  System.out.println("Dont enter ANV(Please enter a valid integer!)");
			 }
			 catch(InvalidWithDrawException iwe)
	         {
			  System.out.println("Enter a valid amount to withdraw");
			 }
			 catch(InsuffFundsException ife)
        	 {
			  System.out.println("Insufficient funds in your acc!!");
		     }
			 break;
	case 3: bo.BalEnq();
	        break;
	case 4: System.out.println("Thanks for using this app!"); 
		    System.exit(0);
			break;
	default:System.out.println("Enter a valid input");
   }
  }
  catch (NumberFormatException nfe)
  {
   System.out.println("Dont enter ANV(Please enter a valid integer!)");
  }//catch()
  }
 }//main
}//ATMPro -- class