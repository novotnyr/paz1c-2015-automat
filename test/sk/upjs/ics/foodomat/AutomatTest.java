
package sk.upjs.ics.foodomat;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutomatTest {

    @Test
    public void test() {
        Automat automat = new Automat();
        automat.vlozPeniaze(3);
        automat.nacitajKod(2);
        Potravina kola = automat.vydajPotravinu();
        Assert.assertNotNull(kola);
        Assert.assertEquals("Kola", kola.getNazov());
    }

}