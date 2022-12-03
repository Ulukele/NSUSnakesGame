package ru.nsu.ccfit.arkhipov.snakes.net.messages;

public class PingMessage extends Message {
    public PingMessage() {
        super(MessageType.PING);
    }
}
