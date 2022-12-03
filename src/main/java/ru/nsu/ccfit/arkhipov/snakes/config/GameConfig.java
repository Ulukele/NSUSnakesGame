package ru.nsu.ccfit.arkhipov.snakes.config;

public interface GameConfig {

    int getFieldWidth();

    int getFieldHeight();

    int getFoodStaticNumber();

    int getFoodPerPlayer();

    double getProbabilityOfDeadSnakeCellsToFood();
}
