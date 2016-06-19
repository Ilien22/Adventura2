package com.company;

//import com.company.akce.Uloz;

/**
 * Created by Tibor on 3. 4. 2016.
 */
public class Hrdina extends Bytost {

    Inventar inventar;

    public Hrdina() {
        super("Franta",10, 1, 1); //super zavolá konstruktor předka
        this.inventar = new Inventar(); //funguje i bez this
    }

    public Inventar getInventar() {
        return inventar;
    }

public String serialize (){
    Inventar inventar = new Inventar();
    return "Herdina - " + "životy: " + getZivoty() + " útok: " + getUtok() + " Obrana: " + getObrana() + "\n" + inventar.serialize();
}

    /*        getZivoty().serialize();   tohle očividně nefunguje
        getObrana().serialize();
        getUtok().serialize();
        inventar.serialize();
        serialize().contains(zivoty(getZivoty()), utok(), obrana(), inventar());
   }
}
*/
}