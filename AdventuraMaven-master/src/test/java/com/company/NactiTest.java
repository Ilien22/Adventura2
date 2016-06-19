package com.company;

import com.company.akce.Nacti;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Ilien on 19.6.2016.
 */
public class NactiTest extends Nacti {
    Nacti nacti;

    @Test
    public void test () throws IOException {
        Nacti nacti = new Nacti();
        nacti.proved(new String[] {"uloz", "uloz1"});
    }
}
