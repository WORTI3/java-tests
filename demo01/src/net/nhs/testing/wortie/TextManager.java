package net.nhs.testing.wortie;

import org.jetbrains.annotations.NotNull;

// Includes code for text management, testing java whilst learning :)
public class TextManager {

    public static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

    @NotNull
    public static String timesTableGenerator(int num) throws NullPointerException {
        if(num == 0 ){
            System.out.println("Anything times zero is zero dummy..!?");
        }
        // loop 1 - 10, does anyone want more than 10 of the times table?
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        return "Here is the " + num + " times table.";
    }

}
