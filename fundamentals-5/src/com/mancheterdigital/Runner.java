package com.mancheterdigital;
// make use of the classes
public class Runner {
    public static void main(String[] args) {
        /*
         call class.var
         catch, top one wil guess the one as put in the class
         just added the try/catch as someone else might need to see what potential throw is
         Don't normally do print stack trace but can see
         Set another value at bottom as default. id = Long.MAX_VALUE.
         */

        Long id;

        try {
            id = Utility.convertStringToLong("1234H6");
            System.out.println(id);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Input provided was not a valid number: " + e);

            id = Long.MAX_VALUE;
        }

        System.out.println("My ID is: " + id);



        /* don't do: Worse than putting exception in. Absorbes everyting Above exception.
        try {
            Long num = Utility.convertStringToLong("23");
        }
        catch (Throwable e) {
           // don't do this. Catch with nothing in it.
        }


        //dont do this also:  Don't rethrow the throw + pass the buck.
        //also don't serr. Will log whatever stack trace it thiks it has. Then when throws they get it on their end as well
        try {
            Long num2 = Utility.convertStringToLong("23");
        }  catch (NumberFormatException e) {
            // don't do this
            System.err.println(e);
            throw e;
        }

        // FileInputStream is = new FileInputStream();
        try {
            Long num3 = Utility.convertStringToLong("23");
        } catch (NumberFormatException e) {
            System.err.println(e);
            throw new IllegalArgumentException("Invalid input provided", e);
        }
        // finally {
            // is.close
            // This will close it if using a file reader.

        }
         */



        // will determine true. Add Utility.isEven(2).var to get version
        boolean result = Utility.isEven(3);

        System.out.println("Result: " + result);

        boolean namesSame = Utility.isNamesMatch("Kate", "kate");

        System.out.println("Result: " + namesSame);

        // object of poodle, of type Dog. An instance of Dog is called poodle. Only instance if use <new> keyword
        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());

        //static method. Has to be accessed at the class level. <Dog>
        Dog.relieve();
        System.out.println(Dog.NUMBER_OF_TEETH);


    }

}
