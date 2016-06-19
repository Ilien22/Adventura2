package com.company;

import com.company.akce.Uloz;
import org.junit.Test;

/**
 * Created by Tibor on 15. 5. 2016.
 */
public class UlozTest {
    Uloz uloz;
    Mapa mapa;

    @Test
    public void UlozTest () {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Uloz testovana = new Uloz(mapa, hrdina);
        testovana.proved(new String[]{"uloz","uloz1"});
    }
}
