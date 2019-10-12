package com.manchesterdigital;

    /*
    for UserService
 find a user in a database (pretending its there) and return it back. Simple class. In real world have breakdown
 first name, second name, address etc
 */

public class User {
    private Long id;
    private String firstName;

    // constructor
    public User (String firstName) {
        this.firstName = firstName;
        }

    // getter
    public String getFirstName() {
            return firstName;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // to string. Under Cmd N. Close to JSON?. Just logs 'firstName= <first name>

        @Override
        public String toString() {
            return "firstName= " + firstName;
        }
    }

