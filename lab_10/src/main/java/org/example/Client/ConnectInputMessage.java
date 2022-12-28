package org.example.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectInputMessage implements Runnable {
    private final Socket serverConnect;
    private final InputStream inputStreamServer;

    public ConnectInputMessage() {
        try {
            serverConnect = new Socket("localhost", 8080);
            inputStreamServer = serverConnect.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException("Can't connect to server");
        }
    }

    public InputStream getInputStreamServer() {
        return inputStreamServer;
    }

    @Override
    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStreamServer));
        String message;

        while (true) {
            try {
                message = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (message != null) {
                System.out.println(message);
                break;
            }
        }
        
        System.out.println("Connected");

        PrintWriter out;
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("----Write massage or exit the chat----");

            try {
                message = inputUser.readLine();
                out = new PrintWriter(serverConnect.getOutputStream(), true);
                out.println(message);

                if(message != null && message.equals("exit"))
                {
                    serverConnect.close();
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
