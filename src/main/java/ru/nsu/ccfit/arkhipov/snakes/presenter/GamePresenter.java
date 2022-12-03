package ru.nsu.ccfit.arkhipov.snakes.presenter;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.arkhipov.snakes.presenter.event.UserEvent;


public interface GamePresenter {
    void fireEvent(@NotNull UserEvent userEvent);
}
