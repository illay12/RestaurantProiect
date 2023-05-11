import java.time.LocalTime;  
import java.util.*;

public class Chitanta extends Comanda{
    private int ID = (int) Math.random();
    private LocalTime data = LocalTime.now();
    public int nrMasa;
    public Angajat chelner;
    public boolean platit=false;
    
    
    public Chitanta(int nrMasa,Angajat ag){
        this.nrMasa = super.getNrMasa();
        this.chelner = super.getMese().get(nrMasa).getChelner();
    }
    
    public int getID()
    {
        return ID;
    }
    
    public LocalTime getData()
    {
        return data;
    }
    
    public Angajat getChelner()
    {
        return chelner;
    }
    
    public boolean isPlatit()
    {
        return platit;
    }
    
}
