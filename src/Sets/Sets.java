package Sets;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        setsExample();
        setsAssignment();
    }

    public static void setsExample(){
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(1);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);

        System.out.println("set1 = " + set1);
        System.out.println("List1 = " + list1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        System.out.println("set2 = " + set2);

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>();
        set2.retainAll(set1);
        System.out.println("Intersection: " + set2);

        //subset
        boolean isSubset = set1.containsAll(set2);
        System.out.println("Is set2 a subset of set1? " + isSubset);

    }

    // assignment create a method that takes a list of integers and returns a set of unique integers
    public static void setsAssignment(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> one= new ArrayList<>();
        System.out.println("Please enter number if Iterations: ");
        Integer input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            one.add(scanner.nextInt());
        }

        Set<Integer> set1 = new HashSet<>();

        set1.addAll(one);
        System.out.println("The list is: " + one);
        System.out.println("The set is: " + set1);


    }

}
