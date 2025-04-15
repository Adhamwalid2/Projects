package packageBank;
public class Account {
    private int accnum;
    private double balance;

    public Account(){
        
    }

    public void deposit(double value){
       if(value>0){
          balance+=value;
       }else{
       System.out.println("Invalid value");
    }
}

    public void withdraw(double value){
        if(value<0){
        System.out.println("Invalid value");
        }
        if(value>balance){
        System.out.println("Insufficient balance");
    }
       balance-=value;
    }

    public int getAccnum(){
        return accnum;
    }
    public double getBalance(){
        return balance;
    }
    
}
