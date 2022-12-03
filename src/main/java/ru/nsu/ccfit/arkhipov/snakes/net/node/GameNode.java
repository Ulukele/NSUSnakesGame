package ru.nsu.ccfit.arkhipov.snakes.net.node;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.arkhipov.snakes.net.NetNode;
import ru.nsu.ccfit.arkhipov.snakes.net.NodeHandler;
import ru.nsu.ccfit.arkhipov.snakes.game.Direction;
import ru.nsu.ccfit.arkhipov.snakes.net.messages.Message;


public interface GameNode {
    void handleMessage(@NotNull NetNode sender, @NotNull Message message);

    void setNodeHandler(@NotNull NodeHandler nodeHandler);

    void makeMove(@NotNull Direction direction);

    void stop();
}
