import java.util.*;
public class Restaurant {
    
protected Meniu meniu = new Meniu();
private List<Angajat> angajati = new ArrayList<Angajat>();
private List<Masa> mese = new ArrayList<Masa>(); 

public Meniu getMeniu()
{
    return meniu;
}

public List<Masa> getMese()
{
    return mese;
}


public List<Angajat> getAngajati()
{
return angajati;   
}

public void removeAngajat(Angajat ang)
{
    angajati.remove(ang);
}

public void addAngajat(Angajat ang)
{
    angajati.add(ang);
}

}
