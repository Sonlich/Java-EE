package org.example.Client;

public class MainClient2 {
    public static void main(String[] args) {
        ConnectInputMessage connectWithServer = new ConnectInputMessage();

        Thread threadConnectInputMessage = new Thread(connectWithServer);
        threadConnectInputMessage.start();

        ReceiveMessageFromServer receiveMessage = new ReceiveMessageFromServer(connectWithServer.getInputStreamServer());

        Thread threadReceiveMessage = new Thread(receiveMessage);
        threadReceiveMessage.start();
    }
}
