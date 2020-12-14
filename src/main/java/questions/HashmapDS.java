package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapDS {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap() {{
            put("chandra", 3);
            put("bhushan", 5);
        }};


        map.entrySet().stream().sorted(Map.Entry.comparingByValue());
    }
}
