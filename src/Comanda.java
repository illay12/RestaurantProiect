import java.util.*;

public class Comanda extends Restaurant{
    public int nrMasa=0;
    public List<Product> listaProduse = new ArrayList<>();
    Meniu meniu;
    public Comanda(int nrMasa)
    {
        this.nrMasa = nrMasa;
        this.meniu = super.getMeniu();

    }
    
    public void addProduct(Product p)
    {
        listaProduse.add(p);
    }
    
    public void removeProduct(Product p)
    {
        listaProduse.remove(p);
    }
    
    public double getPretTotal()
    {
        double s=0;
        for(int i= 0; i < listaProduse.size(); i++) 
            s+=listaProduse.get(i).getPret();
        return s;
    } 
    
    public int getNrMasa()
    {
        return nrMasa;
    }
    
    public List<Product> getListaProduse()
    {
        return listaProduse;
    }
}
