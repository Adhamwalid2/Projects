package packageBank;

public class Bank {
    private Account[]accounts;
    
    public Bank(int NumberOfAccounts){
     if(NumberOfAccounts<30){
        this.accounts=new Account[NumberOfAccounts];
     }else{
        this.accounts=new Account[30];
     }
    }

    public void update(){
        for(int i=0;i<accounts.length;i++){
            if(accounts[i] instanceof SavingsAccount){
             ((SavingsAccount)accounts[i]).interest();
            }
            if(accounts[i] instanceof CurrentAccount){
               CurrentAccount current=((CurrentAccount)accounts[i]);
               if(current.getBalance()<current.getLimit()){
                 System.out.println("Current account is overdrawn");
                }
            }   
            }
        }
    public int open(boolean type){
    for(int i=0;i<accounts.length ;i++){
      if(accounts[i]==null){ 
       if(type){
        accounts[i]=new SavingsAccount();
        System.out.println("SavingsAccount "+(i+1)+" is opened");
       }else{
       accounts[i]=new CurrentAccount();
       System.out.println("CurrentAccount "+(i+1)+" is opened");
      }
      return i+1;
     }
    } 
    return -1;
}

   public boolean close(int accnum){
     if(accnum>0&accnum<=accounts.length&accounts[accnum]!=null){
       accounts[accnum]=null;
          System.out.println("Account number "+accnum+" has been closed");
           return true;
    }
     System.out.println("Account number "+accnum+" is unvailable");
     return false;
   }

   public void deposit(int accnum,double value){
     for(int i=0;i<accounts.length;i++){
        if(i==accnum-1&&accounts[i]!=null){
          accounts[i].deposit(value);
          System.out.println("Ammount "+value+" has been deposited account "+accnum);
          return;
        }
     }
     System.out.println("Invalid account number");
     return;
   }

   public void withdraw(int accnum,double value){
    for(int i=0;i<accounts.length;i++){
        if(i==accnum-1&&accounts[i]!=null){
            accounts[i].withdraw(value);
            System.out.println("Ammount "+value+" has been withdrawn from account "+accnum);
            return;
        }
    }
     System.out.println("Invalid account number");
     return;
   }
}


