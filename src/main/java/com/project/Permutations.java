package com.project;

import java.util.ArrayList;
import java.util.HashSet;

public class Permutations {

    private static final ArrayList<String> permutationList = new ArrayList<String>();

    private Permutations() {

    }

    static void printPermutations(String string) {

        generatePermutations(string, "");

        System.out.println(permutationList);
        permutationList.clear();

    }

    static void printPermutationsUnique(String string) {

        generatePermutations(string, "");
        HashSet<String> permutationSet = new HashSet<>(permutationList);

        System.out.println(permutationSet);
        permutationList.clear();

    }

    private static void generatePermutations(String string, String permutation) {

        if (string.length() == 0) {
            permutationList.add(permutation);
            return;
        }

        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);

            String leftoverCharacters = string.substring(0, i) +
                    string.substring(i + 1);

            generatePermutations(leftoverCharacters, permutation + character);

        }

    }

}


