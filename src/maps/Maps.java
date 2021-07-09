package maps;

import java.util.HashMap;

public class Maps {
    public int m(HashMap<String, Integer> map, String s) {
        if (map.containsKey(s)) {
            return 1;
        } else {
            return 0;
        }
    }
}