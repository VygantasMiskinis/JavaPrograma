package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public int[] minMax (int a){

        return null;
    }

    public static String reverse(String s){
        StringBuilder rez = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rez.append(s.charAt(i));
        }

        return rez.toString();
    }

    public static HashMap findRepeatingNumbers (ArrayList <Integer> numbers){
        HashMap <Integer,Integer> countNums = new HashMap<>();
        HashMap <Integer,Integer> reapeatingNums = new HashMap<>();
        for(int i = 0; i<numbers.size();i++) {
            int number = numbers.get(i);
            if (countNums.containsKey(number)) countNums.put(number, countNums.get(number) + 1);
            else countNums.put(number,1);
        }
        for(int number : countNums.keySet()){
            if(countNums.get(number)>1) reapeatingNums.put(number,countNums.get(number));
        }
        return reapeatingNums;
    }

    public static int[] countLetters (String s){

        String vowels = "aąeęėiįyouųū";
        String consonants = "bcčdfghjklmnprsštvzž";
        int vowelCount = 0;
        int consonantCount = 0;

        for(Character letter : s.toLowerCase().toCharArray()){
            if(vowels.contains(letter.toString())) vowelCount++;
            else if(consonants.contains(letter.toString())) consonantCount++;
        }
        int[] rez = {vowelCount,consonantCount};
        return rez;
    }

    public static int[] minMax(ArrayList <Integer> numbers){

       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
        for(int i =0;i<numbers.size();i++){
            if(numbers.get(i)>max) max=numbers.get(i);
            if(numbers.get(i)<min) min=numbers.get(i);
        }
        int[] minMax = {min, max};
        return minMax;
    }

    public static ArrayList generateRandomArray(int size){
        Random rand= new Random();
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        for(int i = 0;i<size;i++){
            numbers.add(rand.nextInt(1000));
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("String: " + "Programuotojas");
        System.out.println("Atvirksciai: " + reverse("Programuotojas"));

        ArrayList <Integer> numbers = generateRandomArray(100);
        System.out.println("Pradinis masyvas: \n" + numbers);
        int[] minMax = minMax(numbers);
        int min = minMax[0];
        int max = minMax[1];
        System.out.println("Didžiausias skaičius: " + max );
        System.out.println("Mažiausias skaičius: " + min );

        HashMap <Integer,Integer> reapeatingNums = findRepeatingNumbers(numbers);

        System.out.println("Pasikartojantys skaičiai masyve \n" + "Formatu: ( Skaicius: pasikartojimai )");

        for(int number : reapeatingNums.keySet()){
            System.out.println(number + ": " + reapeatingNums.get(number));
        }
        String text = "Programuotojo ar tiesiog bet kokio IT specialisto profesija taps vis labiau įprasta.";
        int[] letters = countLetters(text);
        int vowels = letters[0];
        int consonants = letters[1];
        System.out.println("Tekstas :");
        System.out.println(text);

        System.out.println("Balsių skaičius: " + vowels);
        System.out.println("Priebalsių skaičius: " + consonants);


    }
}
