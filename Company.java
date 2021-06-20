public class Company
{

    private LinkedList<Product> products;

    
    private String name;

    public Company(String name)
    {
      products = new LinkedList<>();
      this.name = name;

    }
}
