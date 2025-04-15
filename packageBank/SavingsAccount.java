package packageBank;
public class SavingsAccount extends Account{
    private final double interestRate=0.0227;
    public SavingsAccount() {
            
        }
    
        public void interest(){
        double balance=getBalance();
        if(balance>=100){
        balance+=(balance*interestRate);
        }
        System.out.println("Your balance is below 100 euros");
    }    
}
