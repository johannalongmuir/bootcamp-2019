package com.manchesterdigital;

/*
 find a user in a database (pretending its there) and return it back. Simple class.
 */

public class UserService {

    // create user called April. Create an object but also letting us set an id
    private static User user;

    /*
    Static Block. Dont know this yet. It's freaky deaky. 1L = Long type. Allows to initilise something static.
    Helps set up user. Emulating a database in this setup.
    Complier...is there static..yes at top...anything else....finds static block...does that first..
    does that before even creating user object.
    ID is Long wrapper class so use .equals instead of ==
     */

    static {
        user = new User("April");
        user.setId(1L);
    }

    public User retriveUser(Long id) {
        // Id passing in parameter, does it equal id for "April parameter"
        /*
         originally before refact
         if (id.equals(user.getId())) {
            return user;
        }
        return null;
         */


        /*
         fail fast. Near top. See it easily.
         make sure is not this (!) first. If not will bail straight out.
         Using our exception instead of the compilers
         Changing return to user as assumes should be a user that matches id
         Should rarely see return null;
         */

        if (!id.equals(user.getId())) {
            throw new UserNotFoundException("User not found matching ID: " + id);
        }
        return user;
    }


    public static void main(String[] args) {
        // new object userService of type UserService. Instance of it

        UserService userService = new UserService();

        /*
        now can use userService and . Long.MAX_VALUE maximum value of a long.
        Should get null as no input 1L
        Look at UserNotFoundException for the Exception details

        Error for example:

        User retrievedUser = userService.retriveUser(Long.MAX_VALUE);
        System.out.println(retrievedUser.toString());
        */

        User retrievedUser = userService.retriveUser(1L);
        System.out.println(retrievedUser.toString());

    }

}
