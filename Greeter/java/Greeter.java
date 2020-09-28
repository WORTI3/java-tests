
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

class Greeter{

    public static void main(String[] args){
        greet("bob");
    }

    static void greet(@NotNull String name){
        String cap;
        String pan;
        cap = name.trim();
        pan = cap.substring(0, 1).toUpperCase();
        String nom = cap + pan + cap.substring(1);
        LocalTime now;
        now = LocalTime.now();
        System.out.println(timedGreeting(now) + nom);
    }

    @NotNull
    private static String timedGreeting(LocalTime hours){
        String greeting;
        //LocalTime SIX = new LocalTime(6, 0, 0, 0);
        if(hours.isBefore(LocalTime.parse("05:59:59")) && hours.isAfter(LocalTime.NOON)) {
            greeting = "Good Morning";
        }else if(hours.isBefore(LocalTime.parse("22:00:00")) && hours.isAfter(LocalTime.parse("17:59:59"))){
            greeting = "Good Evening";
        }else if(hours.isBefore(LocalTime.parse("05:59:59")) && hours.isAfter(LocalTime.parse("22:00:00"))){
            greeting = "Good Night";
        }else{
            greeting = "Hello";
        }
        return greeting;
    }



}