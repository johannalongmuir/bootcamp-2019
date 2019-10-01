package com.manchesterdigital;

public class MegaBytesToKiloBytes {

private static final int KILOBYTES_TO_MEGABYTES = 1024;

    public static String convert(String unitToConvertTo, int bytes) {

        if (unitToConvertTo.equalsIgnoreCase("MB")) {
            int numberOfMegaBytes = bytes / KILOBYTES_TO_MEGABYTES;
            int numberOfKiloBytes = bytes % KILOBYTES_TO_MEGABYTES;
            return  numberOfMegaBytes + "MB" + " + " + numberOfKiloBytes + "KB";
        }

        return "Wrong unit type";

    }



     /*
     Megabyes to Kilobytes

        if (unitToConvertTo.equalsIgnoreCase("KB")) {
            return bytes * 1024;
        }
        return 1;
    }
    */

}
