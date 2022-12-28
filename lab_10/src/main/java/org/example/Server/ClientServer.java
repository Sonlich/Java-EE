package org.example.Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;

public class ClientServer implements Runnable{
    static Map<Integer,Socket> mapClient = new TreeMap <Integer,Socket>();
    @Override
    public void run(){
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server is running. Waiting for clients");

            int numberClient = 1;
            Socket client = null;
            while (true) {
                client = server.accept();

                Thread clientThread = new Thread(new ClientThread(client,this,numberClient));
                clientThread.setDaemon(true);
                clientThread.start();

                mapClient.put(numberClient++, client);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendMessageForAllClients(int numberClient, String message) {
        for (Map.Entry<Integer, Socket> entry : mapClient.entrySet()) {
            if (entry.getKey() != numberClient) {
                try {
                    new PrintWriter(entry.getValue().getOutputStream(), true).println("Client " + numberClient + ": " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                    clearClient(numberClient);
                }
            }
        }
    }

    public static void clearClient(int key){
        try{
            System.out.println("Disconnecting Client " + key);

            Socket client = mapClient.remove(key);
            client.close();

            System.out.println("Client " + key + " disconnected");
            sendMessageForAllClients(key, "Client " + key + " disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
