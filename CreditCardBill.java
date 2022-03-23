//Ittehad Qabid Java - A Charge Account Statement

import java.util.*;
import java.text.*;
public class CreditCardBill{
	public static void main (String[] args ) {
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner (System.in);
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(Locale.US);		// Number format for Currency
		System.out.println("My CS Card International Statement");
		
		System.out.println("==================================");
		System.out.print("Previous Balance is: $");						// Asks user for the previous balance amount
		double prevBalance = sc.nextDouble();
		System.out.print("Additional Charges are: $");					// Asks user for their additional charges
		double addCharges = sc.nextDouble();
		double interest;
		if (prevBalance == 0)											// Checking if previous balance is zero or not
			interest = 0;
		else															// If previous balance is greater than zero then 2% owed
			interest = (prevBalance + addCharges) * 0.02;
		System.out.println("Interest is: " + defaultFormat.format(interest));	// Printing the Interest
		double newBalance = prevBalance + addCharges;							// Calculating the New Balance 
		System.out.println("New Balance is: " + defaultFormat.format(newBalance));
		double minPayment;
		if(newBalance < 50)												// Checking if newBalance is less than $50
			minPayment = newBalance;
		else if (newBalance <= 300)									// If newBalance is less than 300 then minPayment will be $50
			minPayment = 50.00;
		else													// Otherwise minPayment is 20% of newBalance
			minPayment = newBalance *0.2;
		System.out.println("Minimum Payment is: " + defaultFormat.format(minPayment));		// Prints minPayment according to conditions
	}
}
