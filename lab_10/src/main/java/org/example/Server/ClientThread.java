package org.example.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientThread implements Runnable{
    Socket clientSocket;
    ClientServer clientServer;
    int numberClient;

    public ClientThread(Socket clientSocket, ClientServer clientServer, int numberClient) {
        this.clientSocket = clientSocket;
        this.clientServer = clientServer;
        this.numberClient = numberClient;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Client " + numberClient + " connected");
            new PrintWriter(clientSocket.getOutputStream(), true).println("Client " + numberClient);
            String clientMessage = null;
            while (true) {
                clientMessage = in.readLine();
                if (!"exit".equals(clientMessage)) {
                    System.out.println("Client " + numberClient + ": " + clientMessage);
                    ClientServer.sendMessageForAllClients(numberClient, clientMessage);
                } else {
                    in.close();
                    clientSocket.close();
                    ClientServer.mapClient.remove(numberClient);
                    System.out.println("Client " + numberClient + " disconnected");
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

