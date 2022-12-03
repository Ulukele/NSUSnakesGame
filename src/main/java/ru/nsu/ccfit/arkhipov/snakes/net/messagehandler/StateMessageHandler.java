package ru.nsu.ccfit.arkhipov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.arkhipov.snakes.net.NetNode;
import ru.nsu.ccfit.arkhipov.snakes.net.messages.StateMessage;

public interface StateMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull StateMessage stateMsg);
}
