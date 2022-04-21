package com.exArr;

import java.util.ArrayList;

//class Main {
//    public static void main(String[] args){
//        ArrayList<String> animals = new ArrayList<>();
//
//        // Add elements
//        animals.add("Dog");
//        animals.add("Cat");
//        animals.add("Horse");
//        animals.add("cho");
//        animals.add("meo");
//        System.out.println("ArrayList: " + animals);
//    }
//}
class Main {
    public static void main(String[] args){
        ArrayList<String> mammals = new ArrayList<>();
        mammals.add("Dog");
        mammals.add("Cat");
        mammals.add("Horse");
        System.out.println("Mammals: " + mammals);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Crocodile");

        // Add all elements of mammals in animals
        animals.addAll(mammals);
        System.out.println("Animals: " + animals);
    }
}