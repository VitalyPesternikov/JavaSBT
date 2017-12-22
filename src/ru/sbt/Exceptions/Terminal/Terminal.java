package ru.sbt.Exceptions.Terminal;

import ru.sbt.Exceptions.Exceptions.*;

public interface Terminal {
    void checkPin(String pin) throws AccountIsLockedException, InvalidPinException;

    int checkBalance() throws LostConnectionException;

    void getCash(int cash) throws InvalidAmountException, NotEnoughMoneyException, LostConnectionException;

    void addCash(int cash) throws LostConnectionException, InvalidAmountException;
}