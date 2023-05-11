import java.util.*;

public class Meniu {
    protected List<Product> meniu = new ArrayList<Product>();
    
    public void addProduct(Product p)
    {
        meniu.add(p);
    }
    
    public void removeProduct(Product p)
    {
        meniu.remove(p);
    }
    
}
