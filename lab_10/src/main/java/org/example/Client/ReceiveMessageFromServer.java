package org.example.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ReceiveMessageFromServer implements Runnable {
    private final InputStream inputStreamServer;

    ReceiveMessageFromServer(InputStream inputStream) {
        inputStreamServer = inputStream;
    }

    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStreamServer))){
            String message;
            while(true){
                message = br.readLine();

                if(message != null){
                    System.out.print("\r");
                    System.out.println(message);
                    System.out.println("----Write the massage or exit the chat----");
                }
            }
        } catch (IOException e) {
            System.err.println("Socket is closed");
        }
    }
}
