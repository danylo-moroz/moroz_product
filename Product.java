public class Product
{
 private String name;
 
 private float price;


 private boolean onStock;

 public Product(String name, boolean anStock float price)
 {
  setName(name);
  setOnStock(onStock);
  setPrice(price);
 }

 public String getName()
 {
   return name;
 }

 public void setName(String name)
 {
   this.name = name;
 }


 public boolean getOnStock()
 {
   return onStock;
 }

 public void setOnStock(boolean onStock)
 {
  this.onStock = onStock;
 }

    
 public float getPrice()
 {
     return price;
 }
    
public void setPrice(float Price)
{
    this.price = price;
}

}
