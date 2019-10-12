package com.manchesterdigital;

/*
Unchecked example
Keyword extends....Null pointer is type of RuntimeException. Look at the tree.
Creates our own one
 */

public class UserNotFoundException extends RuntimeException {

    // constructor. Allows to create your own Exception and create your own message for it

    public UserNotFoundException(String message) {
        super(message);
    }
}
