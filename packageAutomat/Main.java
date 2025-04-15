package packageAutomat;

public class Main {
   public static void main(String[] args) {
    Ware ware1=new Ware(1, "choclate", 100);
    Ware ware2=new Ware(2, "Juice", 90);
    Ware ware3=new Ware(3, "Chips", 200);
    Ware ware4=new Ware(4, "Cola", 80);
    Ware ware5=new Ware(5, "Gums", 50);
    Muenzsystem ms=new Muenzsystem();
    Automat aut=new Automat(ms, new Ware[]{ware1,ware2,ware3,ware4,ware5});
    aut.printWare();
    aut.Insert(100);
    aut.select(1);
    aut.Insert(55);
    aut.Insert(50);
    aut.Insert(20);
    aut.Insert(10);
    aut.select(4);
    aut.reset();
    
   } 
}
