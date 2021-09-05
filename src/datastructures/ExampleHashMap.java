package datastructures;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {
        // Key, Value
        Map<String, String> map = new HashMap<>();

        // insert
        map.put("key1", "value1");

        // read
        System.out.println(map.get("key1"));

        // delete
        map.remove("key1");

        // merge
        map.merge("key2", "value2-1", String::concat);
        System.out.println(map.get("key2"));

        // merge again
        map.merge("key2", "value2-2", String::concat);
        System.out.println(map.get("key2"));

        // only insert if missing
        map.putIfAbsent("key1", "nothing-happens");

        // replace
        map.replace("key1", "replaced-value-1");

        System.out.println(map.get("key1"));
    }
}
