package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Ilien on 12.6.2016.
 */
public class TestDateServer {
    @Test
    public void test () throws IOException{
        Socket socket = new Socket("localhost", 9090);
         //local host - local host bude přeložen jako IP adresa tohodle počítače ; textová reprezentace podle konvence stroje na kterým je to spuštěný
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // BufferedReader - umožní nepracovat s kouskama bajtů, ale s nějakým celkem; načítá data do nějakéhu bufferu odkud je pak můžem vytáhnout vcelku
        System.out.println( in.readLine());
    }
}
