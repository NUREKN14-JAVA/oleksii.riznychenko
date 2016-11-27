package com.kn146.kostia.db;

/**
 * Created by Константин on 07-Nov-16.
 */
public class DatabaseException extends Exception {
    public DatabaseException(Throwable cause) {
        super(cause);
    }

    public DatabaseException() {
        super();
    }

    public DatabaseException(String message) {
        super(message);
    }
}
