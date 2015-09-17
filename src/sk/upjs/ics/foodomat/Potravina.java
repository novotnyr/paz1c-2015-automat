package sk.upjs.ics.foodomat;


public class Potravina {
    private String nazov;
    
    private int cena;

    public Potravina(String nazov, int cena) {
        this.nazov = nazov;
        this.cena = cena;
    }
    
    

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    
    
}
