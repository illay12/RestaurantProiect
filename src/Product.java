public class Product {
    private String nume;
    private int cantitate;
    private String unitateDeMasura;
    private double pret;
    public CategorieProduct categorie;
    
    public Product(String nume,int cantitate,String unitateDeMasura,double pret,CategorieProduct categorie)
    {
        this.nume = nume;
        this.cantitate = cantitate;
        this.unitateDeMasura = unitateDeMasura;
        this.pret = pret;
        this.categorie = categorie;
    }
    
    public String getNume()
    {
        return nume;
    }
    
    public int getCantitate()
    {
        return cantitate;
    }
    
    public String getUnitateDeMasura()
    {
        return unitateDeMasura;
    }
    
    public double getPret()
    {
        return pret;
    }
    
    public void setPret(double p)
    {
        pret = p;
    }
    
    public void setCantitate(int c)
    {
        cantitate = c;
    }
    
    public CategorieProduct getCategorie()
    {
        return categorie;
    }
}
