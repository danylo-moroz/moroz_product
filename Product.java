public class Product
{
 private String name;
 
 private float price;


 private int id;

 public Product(String name, int id, float price)
 {
  setName(name);
  setId(id);
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


 public int getId()
 {
   return id;
 }

 public void setId (int id)
 {
  this.id = id;
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
