package ru.nsu.ccfit.arkhipov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.arkhipov.snakes.net.NetNode;
import ru.nsu.ccfit.arkhipov.snakes.net.messages.PingMessage;

public interface PingMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull PingMessage pingMessageHandler);
}
