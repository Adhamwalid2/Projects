package packageAutomat;
public class Muenzsystem {
   final static private int[]validCoins={1,2,5,10,20,50,100,200};
   private int[]currentCoins={0,0,0,0,0,0,0,0};
   
   public Muenzsystem(){}

  private int isCoin(int coin){
      for(int i=0;i<validCoins.length;i++){
        if(coin==validCoins[i]){
            return i;
        }
      }  
      return -1; 
    }
    public boolean insert(int coin) {
        int index = isCoin(coin); // Check if coin is valid
    
        if (index == -1) {
            return false; // Invalid coin, return false
        }
    
        currentCoins[index]++; // Insert the coin by increasing its count
        return true; // Successfully inserted
    }
    public int getCurrentValue(){
      int total=0;
      for(int i=0;i<validCoins.length;i++){
        total+=validCoins[i]*currentCoins[i];
      }
      return total;
    }

    public boolean buy(int price){
        if(getCurrentValue()>=price){
            return true;
      }
      return false;
    }
    public void reset(){
        System.out.println("Your "+getCurrentValue()+" coins are back");
        for(int i=0;i<currentCoins.length;i++){
            currentCoins[i]=0;
        }
    }
}
