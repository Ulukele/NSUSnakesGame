package ru.nsu.ccfit.arkhipov.snakes.presenter.event;

public class NewGameEvent extends UserEvent {
    public NewGameEvent() {
        super(UserEventType.NEW_GAME);
    }
}
