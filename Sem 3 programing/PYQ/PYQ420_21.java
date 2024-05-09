import java.util.ArrayList;
public class PYQ420_21{
    private String ProductName;
    private int Productid;
    private double ProductPrice;
    public void setName(String name){
        this.ProductName = name;
    }
    public String getName(){
        return this.ProductName;
    }
   public  void setProductId(int id){
        this.Productid = id;
    }
    public int getId(){
        return this.Productid;
    }
    public void setPrice(double ProductPrice){
        this.ProductPrice = ProductPrice;
    }
    public double getPrice(){
        return this.ProductPrice;
    }
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<Object>();
       PYQ420_21 t = new PYQ420_21();
       t.setName("Pen");
       t.setProductId(2001102);
        t.setPrice(10.546);
        al.add(ProductName);
        al.add(Productid);
        al.add(ProductPrice);
        System.out.println(al);
    }
}

