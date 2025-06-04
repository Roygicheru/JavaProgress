package JavaLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaListsOne {
    public void arrayListExample(){
        ArrayList<String> animals = new ArrayList<>();

        animals.add("goat");
        animals.add("sheep");
        animals.add("jogoo");
        animals.add("punda");
        animals.add("pig");
        // ["goat","sheep","jogoo","punda","pig"]

        animals.remove("sheep");
        // ["goat","jogoo","punda","pig"]
        animals.remove(0);
        // ["jogoo","punda","pig"]


        animals.set(animals.size()-2, "dog");
        // ["jogoo","dog","pig"]

        // System.out.println("The second element is :"+animals.get(1));
        // System.out.println("The animals are:"+animals);

        Iterator<String> animalsIterator = animals.iterator();

        while (animalsIterator.hasNext()) {
            System.out.println(animalsIterator.next());
        }
    }

    public void listExample(){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // [1,2,3]


        List<Integer> numberList2 = new ArrayList<>();
        System.out.println("The number list 2 before :"+numberList2);

        // []

        numberList2.addAll(numbers);

        System.out.println("The number list 2 after :"+numberList2);

    }
}
