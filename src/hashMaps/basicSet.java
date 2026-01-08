package hashMaps;

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Note -> In hashset occurrence of every element is 1.
        // Insert : TC = 0(1)
        set.add(20);
        set.add(10);
        set.add(100);
        set.add(80);
        set.add(-8);
        System.out.println(set); // print in random order

        // search -> true/false : TC = 0(1)
        System.out.println(set.contains(20));
        System.out.println(set.contains(50));


        System.out.println(set.size());
        set.remove(100);
        System.out.println(set);
        System.out.println("Size is " + set.size());

        // for print hastSet
        for(int ele : set) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
