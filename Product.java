public class Product
{
 private String name;
 
 private float price;

 public Product(String name, float price)
 {
  setName(name);
  setPrice(price);
 }

 public String name()
 {
   return name;
 }

 public void setName(String name)
 {
   this.name = name;
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
