package ru.sbt.Exceptions.Exceptions;

public class InvalidPinException extends Throwable {
    private final int attempt;

    public InvalidPinException(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

}
