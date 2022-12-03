package ru.nsu.ccfit.arkhipov.snakes.net.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.arkhipov.snakes.net.NetNode;
import ru.nsu.ccfit.arkhipov.snakes.net.messages.RoleChangeMessage;

public interface RoleChangeMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull RoleChangeMessage roleChangeMsg);
}
