package ru.sbt.Exceptions.Server;

import ru.sbt.Exceptions.Exceptions.InvalidAmountException;
import ru.sbt.Exceptions.Exceptions.LostConnectionException;
import ru.sbt.Exceptions.Exceptions.NotEnoughMoneyException;

public interface Server {
    void getCash(int amount) throws InvalidAmountException, NotEnoughMoneyException, LostConnectionException;

    int getBalance() throws LostConnectionException;

    void addCash(int amount) throws LostConnectionException, InvalidAmountException;

}
