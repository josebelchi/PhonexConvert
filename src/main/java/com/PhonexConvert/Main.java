package main.java.com.PhonexConvert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    }

    public static void Phonex(){
        Scanner input = new Scanner(System.in);
        String phrase = "";

        do{
            if (phrase.isEmpty()){
                System.out.println("-=- Phonetic Alphabet Convert -=-");
            }

            System.out.println("Quiere pasar de texto natural a Alfabeto fonético (1) o al revés (2)?");
            phrase = input.nextLine();

        } while(true);
    }
}
