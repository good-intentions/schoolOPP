package simeon;

public class SavingsAcount {
      
	public String name;
	public double balance = 0;
	public double intrestRate = 0.01; 
	public void deposit(int x){
		balance+=x;
	}
	public void withdraw( double x){
		if( x>balance || x<0) System.out.println("Greshka");
		else{
			balance-=x;
			System.out.println("New banance " + balance);
		}
	}

}
