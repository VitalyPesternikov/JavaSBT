package ru.sbt.Exceptions.Exceptions;


public class AccountIsLockedException extends Throwable {
    private final long Time;

    public AccountIsLockedException(long Time) {
        this.Time = Time;
    }

    public long getTime() {
        return Time;
    }

}