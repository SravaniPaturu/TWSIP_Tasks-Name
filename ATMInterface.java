//Program for ATM Interface in java
import java.util.*;

public class ATMInterface
{  
     public static void main(String args[])
    {

        int balance=0,withdraw_amount,deposit_amount,transfer_amount;

        String accN1="x1234",accN2="x3456",AccountNum1,AccountNum2,PinNum;

        String pin="5678";

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Account Number:");
        AccountNum1=sc.nextLine();

        System.out.print("Enetr your pin number:");
        PinNum=sc.nextLine();

        ArrayList<String> l=new ArrayList<>();

        l.add("Account Number:"+accN1);
        l.add("Pin Number:"+pin);

        System.out.println("Account Details:"+l);
        
        if(AccountNum1.equals(accN1) && PinNum.equals(pin))
        {
        while(true)
        {
        System.out.println("\nATM MACHINE\n");

        System.out.println("Choose 1 for Deposit\n"+"Choose 2 for Withdraw\n"+"Choose 3 for Check Balance\n"+"Choose 4 for Fund Transfer\n"+"Choose 5 for EXIT\n");

        System.out.print("Choose the operation:");
        int choice=sc.nextInt();

        switch(choice)
        {
        case 1: System.out.print("Enter amount to be deposited:");
                deposit_amount=sc.nextInt();

                balance=balance+deposit_amount;

                System.out.println(deposit_amount+" has been successfully credited into Account Number "+AccountNum1);

                System.out.println("Your updated balance is:"+balance);
                break;
        

        case 2: System.out.print("Enter amount to be withdraw:");
                withdraw_amount=sc.nextInt();

                if(balance<=withdraw_amount)
                {
                    System.out.println("Insufficient balance");
                }

                else
                {
                    balance=balance-withdraw_amount;

                    System.out.println(withdraw_amount+" has been successfully debited from Account Number "+AccountNum1);

                    System.out.println("Your updated balance is:"+balance);
                }
                break;

        case 3: System.out.println("Your current Balance is"+":"+balance);
                break;

        case 4: System.out.print("Enter Account Number for fund transfer:");
                Scanner in=new Scanner(System.in);
                AccountNum2=in.nextLine();

                System.out.print("Enter amount to be transfered:");
                transfer_amount=sc.nextInt();

                if(transfer_amount>balance)
                {
                    System.out.println("Insufficient balance\n");
                }
                else
                {  if(AccountNum2.equals(accN2))
                    {
                        balance=balance-transfer_amount;

                        System.out.println(transfer_amount+" has been transfered from Account Number "+AccountNum1+" to Account number "+AccountNum2);

                        System.out.println("Your updated balance is:"+balance);
                    }
                    else
                    {
                         System.out.println("Invalid Account Number");
                    }
                }
                break;

        case 5: System.exit(0);

            }
        }
    }

    else
    {
        System.out.println("Your Entered wrong information");
    }
}   

}