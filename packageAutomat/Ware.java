package packageAutomat;
public class Ware {
    private int id;
    private String name;
    private int price;

    public Ware(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "ID: "+id+", Name: "+name+", Price: "+price;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
}
