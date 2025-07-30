package Collections;

import java.util.HashMap;
import java.util.Map;

// Maps does not comes under Collection interface

public class Maps_java {
    public static void main(String a[]) {
        Map<String, Integer> std = new HashMap<>();
        std.put("JK", 56);
        std.put("NK", 79);
        std.put("AM", 61);
        std.put("CV", 59);
        std.put("AM", 94);

        System.out.println(std.keySet());
        for (String key : std.keySet()) {
            System.out.println(key + " : " + std.get(key));
        }
    }
}
