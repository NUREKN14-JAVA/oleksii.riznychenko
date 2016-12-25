package com.kn146.kostia.agent;

/**
 * Created by Константин on 25-Dec-16.
 */

public class SearchException extends Exception {

    private static final long serialVersionUID = 1L;


    public SearchException(String e) {
        super(e);
    }

    public SearchException() {
        super();
    }

    public SearchException(Throwable cause) {
        super(cause);
    }

}