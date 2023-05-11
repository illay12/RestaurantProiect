public class Masa {
    private int nrMasa;
    private Comanda comanda = new Comanda(nrMasa);
    private boolean ocupat=false;
    private Angajat chelner;
    
    public Masa(int nrMasa,Angajat chelner){
    this.nrMasa = nrMasa;
    this.chelner = chelner;
    }
    
    public int getNrMasa(){
        return nrMasa;
    }
    
    
    public Comanda getComanda()
    {
        return comanda;
    }
    
    public void setComanda(Comanda c)
    {
        comanda = c;
    }

    public Angajat getChelner()
    {
        return chelner;
    }
    
            }
