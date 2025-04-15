package packageBank;
public class Main {
    public static void main(String[]args){
      Bank bank=new Bank(30);
        for(int i=0;i<15;i++){
        bank.open(true);
        }
        for(int i=15;i<30;i++){
            bank.open(false);
        }
        for(int i=0;i<30;i++){
            bank.deposit(i+1, Math.random()*1000);
        }
        for(int i=0;i<30;i++){
            bank.withdraw(i+1, Math.random()*1000);
        }
        bank.update();
        bank.close(5);
    }
}
