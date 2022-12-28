package org.example.Server;

public class ServerDemo {
    public static void main(String[] args) {
        ClientServer chatServer = new ClientServer();
        Thread threadChatServer = new Thread(chatServer);
        threadChatServer.start();
    }
}
