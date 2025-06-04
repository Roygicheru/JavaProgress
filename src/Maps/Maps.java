package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
//        Map<String, List<Integer>> numbers = new HashMap<>();
//
//        numbers.put("one", List.of(1, 2, 3));
//        numbers.put("two", List.of(1, 2, 3, 4, 5));
//        numbers.put("three", List.of(1, 2, 5));
//
////        numbers.put("one", 1);
////        numbers.put("two", 2);
////        numbers.put("three", 3);
//
//        for (Map.Entry<String, List<Integer>> entry : numbers.entrySet()){
//            System.out.println("The key is: ." + entry.getKey() + "  The value is: " + entry.getValue());

        ///////////////////////////////////
//        Map<String,List<Integer>> numbers = new HashMap<>();
//
//
//        List<Integer> one = new ArrayList<>();
//        one.add(1);
//        one.add(2);
//        one.add(3);
//
//        numbers.put("one", one);
//        List<Integer> two = new ArrayList<>();
//        two.add(1);
//        two.add(2);
//        two.add(3);
//        two.add(4);
//        two.add(5);
//        numbers.put("two", two);
//
//
//        List<Integer> three = new ArrayList<>();
//        three.add(1);
//        three.add(2);
//        three.add(5);
//        numbers.put("three", three);
//
//        // {"one":1,"two":2,"three":3}
//
//        for(Map.Entry<String,List<Integer>> entry : numbers.entrySet()){
//            if(entry.getKey().equalsIgnoreCase("two")){
//                entry.getValue().set(2, 4);
//            }
//            System.out.println("The key is:"+entry.getKey()+" the value is:"+entry.getValue());
//        }


        Map<Integer,List<String>> stringss = new HashMap<>();


        List<String> one = new ArrayList<>();
        one.add("Tom");
        one.add("Jason");
        one.add("Todd");

        stringss.put(1, one);
        List<String> two = new ArrayList<>();
        two.add("Royce");
        two.add("Valarie");
        two.add("Edna");
        two.add("Kathleen");
        two.add("Gibson");
        stringss.put(2, two);


        List<String> three = new ArrayList<>();
        three.add("Jonie");
        three.add("Troy");
        three.add("Zara");
        stringss.put(3, three);

        System.out.println("The string list of three before changes is: " + three);

        stringss.get(3).clear();
        stringss.get(3). addAll(stringss.get(2));

        for (Map.Entry<Integer,List<String>> entry : stringss.entrySet()){
            System.out.println("The key is: ." + entry.getKey() + "  The value is: " + entry.getValue());
        }

    }

    // assignment, come up with a map the keys are integers and the values are lists of strings
    // make the last two keys have the same array using List functions i.e. addAll()

}

