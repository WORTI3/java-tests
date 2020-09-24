package net.nhs.testing.wortie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static net.nhs.testing.wortie.TextManager.*;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Times Table generator!\nPlease input a number below:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        System.out.println(timesTableGenerator(input));
        //runReversed();
    }

    public static void runReversed(){
        String sentence = "Go work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }
}
