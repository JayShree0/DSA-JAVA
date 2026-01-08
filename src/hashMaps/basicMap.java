package hashMaps;

import java.util.HashMap;

public class basicMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Note : In a Hashmap their 2 or more key with same value, but key are unique.
        // unique key and same values..

        //--------------- HashMap Time Complexity (Average Case) --------------
        // put(key, value)        -> O(1)
        // get(key)               -> O(1)
        // size()                 -> O(1)
        // find()                 -> NOT a HashMap method
        // remove(key)            -> O(1)
        // containsKey(key)       -> O(1)
        // containsValue(value)   -> O(n)
        // entrySet()             -> O(1)
        map.put("Raghav", 76);
        map.put("Anshu", 83);
        map.put("Hima", 71);
        map.put("Himans", 43);
        System.out.println(map);
        System.out.println(map.containsKey("Raghav"));
        System.out.println(map.containsKey("Gagan"));
        map.put("Raghav", 100); // existing key value ko override krdeta hai agr key same se hai to
        System.out.println(map);
        map.put("Maghav", 100);
        System.out.println(map);


        //  IterateMap
        for(String key : map.keySet())
        {
            System.out.println(key + " " + map.get(key));
        }
    }

}
