package packageAutomat;

public class Automat {
    private Muenzsystem ms;
    private Ware[]waren;
    
    public Automat(Muenzsystem ms,Ware[]waren){
        this.ms=ms;
        this.waren=waren;
    }
    
    public void printWare(){
        for(int i=0;i<waren.length;i++){
           System.out.println(waren[i]+"\n"); 
        }
    }
    
    public boolean select(int id){
      for(int i=0;i<waren.length;i++){
        if(id==waren[i].getId()&&ms.buy(waren[i].getPrice())){
            System.out.println(waren[i].getName()+" has been bought");
            return true;
        }
        if(!ms.buy(waren[i].getPrice())){
            System.out.println("insufficient amount");
        }
      }
      System.out.println("Product can't be found");
      return false;
    }

    public boolean Insert(int coins){
       if(ms.insert(coins)){
        System.out.println("You have inserted: "+coins);
        return true;
       }
       System.out.println("You have inserted an invalid coin");
       return false;
    }
    public void reset(){
       ms.reset(); 
       
    }

    }

