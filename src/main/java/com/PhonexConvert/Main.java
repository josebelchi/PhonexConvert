package main.java.com.PhonexConvert;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String phrase = "";

        do {
            if (phrase.isEmpty()){
                System.out.println("-=- Phonetic Alphabet Convert -=-");
            }

            System.out.println("Quiere pasar de texto natural a Alfabeto fonético (\"1\") o al revés (\"2\")? (\"0\" para salir)");
            phrase = input.nextLine();

            if(phrase.equals("1")){

            }
            else if (phrase.equals("2")){

            }
            else if (!phrase.equals("0")){
                System.out.println("Operación no contemplada.");
            }

        } while(!phrase.equals("0"));

        System.out.println("Hasta la próxima, soldado.");
    }
}