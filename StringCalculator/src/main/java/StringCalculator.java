import org.jetbrains.annotations.NotNull;

import java.util.*;
import static java.lang.String.join;
import static java.util.Locale.filter;

public class StringCalculator {

    private static float result;

    public static int add(String input) throws RuntimeException {
        if(input.isEmpty()) {
            return 0;
        }else if(input.contains("-")){
            throw new RuntimeException("Negatives are not allowed.");
        }else{
            calculateSumOf(separateInput(input));
            return formInt(printInteger());
        }
    }

    @NotNull
    private static String[] separateInput(String numbers) { // Should return string array
        return numbers.replace("\n", ",").split(",");
    }

    private static void calculateSumOf(String[] numbers){
        for (String number : numbers) {
            result = Float.sum(result, Float.parseFloat(number));
        }
    }

    private static int formInt(String sum) throws NumberFormatException {
        return Integer.parseInt(sum);
    }

    private static String printInteger() {
        return String.valueOf((int) result);
    }

    /*private static void checkForNegatives(List<Integer> numbers) throws RuntimeException{
        List<Integer> negatives = filter(lessThan(0), numbers);
        if(negatives.size() > 0){
            throw new RuntimeException("Negatives are not allowed: " + join((CharSequence) negatives));
        }
    }*/

}
