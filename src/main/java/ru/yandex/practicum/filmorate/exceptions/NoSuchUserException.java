package ru.yandex.practicum.filmorate.exceptions;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(String errorMessage) {
        super(errorMessage);
    }
}
