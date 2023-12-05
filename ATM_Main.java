package ATM;

import java.util.*;

public class ATM_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMOperationsInterf op = new ATMOperationImpl();
		
		Scanner sc = new Scanner(System.in);
	
		try {
		
		System.out.println("Welcome to ATM");
		
		System.out.println("Enter your 4 digit ATM PIN : ");
		int PIN = sc.nextInt();
		
		if(PIN ==1234)
		{
			while(true)
			{
				System.out.println("----------------------------------");
				System.out.println(" 1. View Available Balance :");
				System.out.println(" 2. Withdraw Amount :");
				System.out.println(" 3. Deposit Amount : ");
				System.out.println(" 4. View Mini Statement :");
				System.out.println(" 5. Exit");
				System.out.println(" Please Enter Your Choice ");
				int ch = sc.nextInt();
				
				if(ch==1)
				{
					op.viewBalance();
				} 
				else if(ch==2)
				{
					try {
					System.out.println("Enter Amount to withdraw =  ");
					
					double withdrawAmount = sc.nextDouble();	
					op.withdrawAmoung(withdrawAmount);
					}
					catch(Exception e)
					{ 
						System.out.println("Wrong Crendtials");
					}
				} 
				else if(ch==3)
				{
					try {
					System.out.println("Enter Amount to Deposit =  ");
					double depositAmount = sc.nextDouble();
					
					op.depositAmount(depositAmount);
					}
					catch(Exception e)
					{
						System.out.println(" Wrong Crendtials..");
					}
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					System.out.println("Please Collect Your ATM Card ...Thankyou.... Visit Again...");
					System.exit(0);
				}
				else
				{
					System.out.println("------Please Choose Available Options Only-----");
				}
			}
			
		}
		else
		{
			System.out.println("Incorrect ATM PIN");
			System.exit(0);
		}
		
		}
		catch(Exception e) {
			System.out.println("You Enter the Value cannot Understand please Try again Later.....");
			System.exit(0);
		}
		
		
	}

}
