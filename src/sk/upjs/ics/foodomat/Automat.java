package sk.upjs.ics.foodomat;

import java.util.HashMap;
import java.util.Map;


public class Automat {
    private int celkovaHodnota;
    
    private int kod;

    private Map<Integer, Potravina> potraviny = new HashMap<Integer, Potravina>();

    public Automat() {
        potraviny.put(1, new Potravina("Margot", 1));
        potraviny.put(2, new Potravina("Kola", 3));
        potraviny.put(17, new Potravina("Bageta", 16));
    }
    
    public void vlozPeniaze(int hodnota) {
        celkovaHodnota = celkovaHodnota + hodnota;
    }

    public void nacitajKod(int kod) {
        this.kod = kod;
    }

    public Potravina vydajPotravinu() {
        Potravina potravina = this.potraviny.get(this.kod);
        if (this.celkovaHodnota >= potravina.getCena()) {
            this.celkovaHodnota = 0;
            return potravina;
        } else {
            return null;
        }
    }

}
