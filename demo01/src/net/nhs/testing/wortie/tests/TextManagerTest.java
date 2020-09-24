package net.nhs.testing.wortie.tests;

import org.junit.jupiter.api.Test;

public class TextManagerTest {

    @Test
    public void timesTableGenerator() throws NullPointerException {
        int num = 5;
        if(num == 0 ){
            System.out.println("Anything times zero is zero dummy..!?");
        }
        // loop 1 - 10, does anyone want more than 10 of the times table?
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        //return "Here is the " + num + " times table.";
    }

    @Test
    public String reverse(String sentence) {
        if (sentence.isEmpty()) return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}