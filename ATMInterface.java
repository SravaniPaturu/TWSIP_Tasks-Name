import java.util.Scanner;

public class ATMInterface
{

    public static void main(String args[])
    {
        int balance=0,withdraw_amount,deposit_amount;
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
        System.out.println("ATM MACHINE\n");

        System.out.println("Choose 1 for Withdraw\n"+"Choose 2 for Deposit\n"+"Choose 3 for Check Balance\n"+"Choose 4 for EXIT\n");

        System.out.print("Choose the operation:");
        

        int choice=sc.nextInt();
        switch(choice)
        {
        case 1: System.out.print("Enter money to be withdraw:");
                withdraw_amount=sc.nextInt();

                if(balance<=withdraw_amount)
                {
                    System.out.println("Insufficient balance\n");
                }
                else
                {
                    balance=balance-withdraw_amount;
                    System.out.println("Your has been successfully debited\n");
                }
                break;
        

        case 2: System.out.print("Enter money to be deposited:");
                deposit_amount=sc.nextInt();
                balance=balance+deposit_amount;
                System.out.println("Your money has been successfully deposited");
                break;

        case 3:
        
             System.out.println("Balance"+":"+balance);
             break;

        case 4:
        
             
             System.exit(0);

            }
        }
        
    }

   
}