package be.intecbrussel;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        List<String> sentences = new ArrayList<>();
        sentences.add("Today is Monday");
        sentences.add("Tomorrow is Tuesday");
        sentences.add("Yesterday was Sunday");
        sentences.add("Yesterday was Sunday");

        //System.out.println(sentences.get(3));

        /*
        Today is Monday
        Tomorrow is Tuesday
        Yesterday was Sunday
        */

        Map<String, String> dayMap = new LinkedHashMap<>();
        dayMap.put("today", "today is Monday");
        dayMap.put("tomorrow", "tomorrow is Tuesday");
        dayMap.put("Yesterday", "Yesterday is Sunday");

        System.out.println(dayMap.get("today")); // key = index

        /*
        KEY = VALUE
        today=today is Monday
        tomorrow=tomorrow is Tuesday
        Yesterday=Yesterday is Sunday
         */

    }
}
