import java.util.Scanner;
interface Payment{
	public void pay(int amount);
	public void checkBalance();	
	}

class CreditCard implements Payment{
	private int balance=20000;
	
	public void pay(int amount)
	{
	  if(amount>0){
	balance-=amount;
	System.out.println("PAYMENT DONE SUCCESSFULLY");
	}
	else
	System.out.println("INVALID AMOUNT ENTERED");
	}
	public void checkBalance(){
	System.out.println("BALANCE:-"+balance);
	}
}


class DigitalWallet implements Payment{
	private int balance=10000;
	/* manam deposit create cheyadam ledu so,balance ni ikkada set chesam some value*/
	public void pay(int amount)
	{
	  if(amount>0){
	balance-=amount;
	System.out.println("PAYMENT DONE SUCCESSFULLY");
	}
	else
	System.out.println("INVALID AMOUNT ENTERED");
	}
	public void checkBalance(){
	System.out.println("BALANCE:-"+balance);
	}
}	

public class AbstractionPaymentStatus{
	public static void main(String[] args){
		Payment cred=new CreditCard();
		Payment digital=new DigitalWallet();
		Scanner sc=new Scanner(System.in);
		int amount=0;
		while(true){
		System.out.println("1.CREDIT CARD");
		System.out.println("2.DIGITAL WALLET");
		System.out.println("ENTER YOUR CHOICE ");
		int ch=sc.nextInt();
		switch(ch){
		case 1:       
			System.out.println("1.PAY");
			System.out.println("2.CHECK BALANCE");
			System.out.println("3.EXIT");
			int choice=sc.nextInt();	
			switch(choice){
			case 1: 
				System.out.println("ENTER AMOUNT TO PAY");
				amount = sc.nextInt();
				cred.pay(amount);
				break;
			case 2:
				cred.checkBalance();	
				break;
			case 3:
				System.out.println("THANK YOU");			
				return;
				}
			break;
		case 2:
			  
			System.out.println("1.PAY");
			System.out.println("2.CHECK BALANCE");
			System.out.println("3.EXIT");
			int option=sc.nextInt();	
			switch(option){
			case 1: 
				System.out.println("ENTER AMOUNT TO PAY");
				amount = sc.nextInt();
				digital.pay(amount);
				break;
			case 2:
				digital.checkBalance();	
				break;
			case 3:
				System.out.println("THANK YOU");			
				return;
				}
			break;
		}
}
}

}
