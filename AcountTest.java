package simeon;

public class AcountTest {
        public static void main(String [] args) {
        	
        	SavingsAcount s001= new SavingsAcount();
        	s001.name = "simo";
        	s001.deposit(1000);
        	System.out.println(s001.balance);
        	s001.withdraw(315.75);
        	
        }
}
