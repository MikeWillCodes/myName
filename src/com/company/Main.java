package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static final int  MAX_SIZE = 20;

    public static void main(String[] args) {

        ArrayList<Integer> absences = absences(MAX_SIZE);
        System.out.println("# of absences: " + absences);

        ArrayList<String> names = initializeNames();
        System.out.println("The names are: " + names);

        names = shuffle(names);
        System.out.println("Shuffled names: " + names);

        ArrayList<String> anotherArray = anotherArray(MAX_SIZE, names);
        System.out.println("List of dups: " + anotherArray);

        boolean check = checker(anotherArray, names);
        System.out.println(check);

        ArrayList<String> perfAttend = perfectAttendance(absences, anotherArray);
        System.out.println("Students with perfect attendance: " + perfAttend);

        ArrayList<String> failedOut = fe(absences,anotherArray);
        System.out.println("Students who failed out: " + failedOut);

    }

    public static ArrayList<Integer> absences(int size){
        Random rand = new Random();
        ArrayList<Integer> absences = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            absences.add(rand.nextInt(10));
        }
        return absences;
    }

    public static boolean checker (ArrayList<String> anotherArray, ArrayList<String> names){
        for (int i = 0; i < anotherArray.size() ; i++) {
            if (anotherArray.contains(names.get(i))){
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

    public static ArrayList<String> perfectAttendance(ArrayList<Integer> absences, ArrayList<String> names){
        ArrayList<String> namesWithPerfectAttendance = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            if(absences.get(i) == 0){
                namesWithPerfectAttendance.add(names.get(i));
            }
        }
        return namesWithPerfectAttendance;
    }

    public static ArrayList<String> fe (ArrayList<Integer> absences, ArrayList<String> names){
        ArrayList<String> namesThatFe= new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            if(absences.get(i) >= 6){
                namesThatFe.add(names.get(i));
            }
        }
        return namesThatFe;
    }
}
