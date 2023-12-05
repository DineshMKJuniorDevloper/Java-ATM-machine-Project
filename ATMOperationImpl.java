package ATM;
import java.util.*;

public class ATMOperationImpl implements ATMOperationsInterf {
	
	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is =  " + atm.getBalance());
		
	}

	@Override
	public void withdrawAmoung(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount<=atm.getBalance()) 
		{
			ministmt.put(withdrawAmount,"Withdraw Amount");
			System.out.println("Please to Collect the cash = " + withdrawAmount );
			atm.setBalance(atm.getBalance() - withdrawAmount);
			viewBalance();	
		}
		else
		{
			System.out.println("Insufficient Balance ");
		}
	}
 
	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount,"Deposit Amount");
		System.out.println( depositAmount+" Deposited Successfully !!");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		if(ministmt.isEmpty())
		{
			System.out.println("Currently Not Available Any Statements..");
		}
		else
		{
			System.out.println("-----------Your Mini Statement is-----");
			for(Map.Entry<Double, String> m : ministmt.entrySet())
			{
				System.out.println(m.getKey() + " "+ m.getValue());
			}
			viewBalance();	
		}
	}

}
