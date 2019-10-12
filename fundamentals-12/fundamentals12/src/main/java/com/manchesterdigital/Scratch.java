package com.manchesterdigital;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Scratch {
    public static void main(String[] args) {
        List<String> names = List.of("jose", "andrew", "emalin");

        System.out.println("names = " + StringUtils.capitalize(names.get(0)));
        System.out.println("StringUtils.defaultString(names.get(0)) = " + StringUtils.defaultString(names.get(0)));

        // Loads of options like if checks if numeric/ just numbers etc
        // Also NumberUtils.
    }
}
