package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map <String, String> countries = new HashMap<>();
        countries.put("enGB", "England");
        countries.put("esEs", "Spain");
        countries.put("ptPt", "Portugal");

        // bad practice as no Polymorph. Not let change into different type of Map
        // HashMap<String, String> names = new HashMap<>();

        // replacing value with put using the key
        String key = "ptPt";
        String portugal = countries.get(key);
        System.out.println("portugal = " + portugal);

        countries.put(key, "Duncan");
        portugal = countries.get(key);
        System.out.println("portugal is now " + portugal);


        // names example
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");

        String removedName = names.remove(2);
        System.out.println("removedName = " + removedName);

        names.remove(2);

        // empties the map:
        names.clear();

        // size of map. at this point 0 as we cleared it
        System.out.println("number of items in the map = " + names.size());


        names.put(1, "April");
        names.put(2, "Sonia");
        names.put(3, "Schmek");


        // print out whats in Map
        for (Map.Entry<Integer, String> me : names.entrySet()){
            System.out.println("key = " + me.getKey() + " , value = " + me.getValue());
        }

        // just want to find key if only want to find key
        for (Integer mapKey : names.keySet()) {
            System.out.println("mapKey = " + mapKey);
        }

        


    }

}
