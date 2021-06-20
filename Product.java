public ckass Product
{
 private String name;

 private boolean onStock;

 public Product(String name, boolean anStock)
 {
  setName(name);
  setOnStock(onStock);
 }

 public String name()
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
}
