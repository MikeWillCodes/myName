package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = initializeNames();
        System.out.println("The names are: " + names);

        names = shuffle(names);
        System.out.println("Shuffled names: " + names);

        ArrayList<String> anotherArray = anotherArray(20, names);
        System.out.println(anotherArray);

        checker(anotherArray);

    }

    public static boolean checker (ArrayList<String> array){
        for (int i = 0; i < array.size(); i++) {
            String name = array.get(i);
            if(array.equals(name)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> initializeNames (){
        // create and output an arrayList of 5 distinct names
        ArrayList<String> names = new ArrayList<>();
        names.add("Michael");
        names.add("Desmond");
        names.add("Mike");
        names.add("Prince");
        names.add("Vivian");
        return names;
    }

    public static ArrayList shuffle (ArrayList<String> names){
        // shuffle the names using a user defined function
        Collections.shuffle(names);
        return names;
    }

    public static ArrayList<String> anotherArray (int size, ArrayList<String> names){
        Random random = new Random();
        ArrayList<String> anotherListOfNames = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int pick = random.nextInt(names.size());
            anotherListOfNames.add(names.get(pick));
        }
        return anotherListOfNames;
    }
}
