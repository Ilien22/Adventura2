package com.company.akce;

import com.company.Hrdina;
import com.company.Mapa;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Ilien on 19.6.2016.
 */
public class Nacti extends Akce {

    Mapa mapa;
    Hrdina hrdina;

    public Nacti (){
        super("nacti", 0);
    }
    public void proved (String [] parametry) {
        try {
            FileReader fr = new FileReader(parametry[1] + ".txt");
            BufferedReader br = new BufferedReader(fr);
/*            br.lines()
                    .forEach(line -> System.out.println());
*/
            br.lines();
            String line = new String();
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
       br.close();
        }
        catch (Exception e){
            e.printStackTrace ();
    }
}
//    public void deserialize(String )

}
    /*
   Stream - proud (např řetězců) - jsou věci, který nám umožní pracovat jen s částí obsahu + potřeba nakonci zavolat collect

   druhá možnost
   přes
   BufferedReader.readLine - vyhazuje buď větu nebo null - dal by se pouřít while cyklus
        tahle druhá metoda by myslím vypadala nějak takhle:
public static void main(String args[]) throws Exception {
FileReader fr = new FileReader("FileReaderDemo.java");
BufferedReader br = new BufferedReader(fr);
String s;
while((s = br.readLine()) != null) {
System.out.println(s);
}
fr.close();
...... tak nakonec nevim první metodu

Deserialize - buď statická metoda nebo konstruktor všude (lokace, pozice, atd)
     */

