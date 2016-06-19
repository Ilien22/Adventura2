package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Ilien on 12.6.2016.
 */
public class DateServer {
    public static void main (String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        while (true) {
            Socket socket = listener.accept(); //vrací objekt typu socket, bez toho se nedozvíme, že se něco stalo (jinak by listener jen seděl a poslouchal ;; accept je metoda, která je blokující a java čeká dokud nedostane spojení - zanořením do nekonečného cyklu bude moct přijmout víc než jedno spojení
            //Socket má metodu getInputStream() a getOnputStream()-output=výstup
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //dělá formát prezentující objekt do formátu output  (usnadňuje psaní řetězců)
            out.println(new Date().toString());
            System.out.println("Spojení přijato");
            socket.close();
        }//tímhle máme server, teĎ  musíma napsat klienta v testu
    }
}
/*
Porty
-	80 http
-	443 https - šifrovaný http
-	22 ssh – přihlašování do terminálu na server, šifrovaný
Šifrování
-	Symetrické – obě  strany mají stejný klíč podle kterého šifrujou
-	Asymetrické – soukromý a veřejný klíč – ostatní vám něco pošlo podle public key a program rozšifruje podle private key
Na straně serveru běží aplikace - ta říká systému, když něco přijde na port 80 tak mi o tom řekni
Aplikace přijme požadavek (pracuje se přes knihovny) – v javě je pro to balíček java.net
-	Naivní – umí přijmout jen jeden požadavek
Vlákna – umožňuje dělat víc věci vedle sebe (souběžně)
-	Paralelní – např. pro obsluhu více klientů vedle sebe, věci běží najednou
-	asynchronní programování – např. java script
Java skript je prontfront (uživatelský rozhraní) na všech webových stránkách
ServerSocket – reprezentace portu; třída co poslouchá na nějakým portu
-	může přijmout i víc socketů
Socket (zdířka) – představuje jednoho připojeného uživatele
Metoda accept -


nekonečno -
1) while true -
2) for cyklus obsahující ;;
//while se používá pokud nevim, kolikrát chci nějakou věc opakovat... for pokud vim kolikrát (můžu tam jednoduše nacpat číslo)
 */